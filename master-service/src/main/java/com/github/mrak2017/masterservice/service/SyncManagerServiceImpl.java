package com.github.mrak2017.masterservice.service;

import com.github.mrak2017.masterservice.dto.StartSyncParamsDTO;
import com.github.mrak2017.masterservice.dto.SyncCommandResultDTO;
import com.github.mrak2017.masterservice.model.entity.Author;
import com.github.mrak2017.masterservice.repository.AuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@Service
public class SyncManagerServiceImpl implements SyncManagerService {
    final String uri = "http://nginx-balancer:80/sync-api/";

    private final AuthorRepository authorRepository;

    public SyncManagerServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public void startSync() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            StartSyncParamsDTO request = new StartSyncParamsDTO();
            SyncCommandResultDTO result = restTemplate.postForObject(uri, request, SyncCommandResultDTO.class);
            System.out.println(result.getStatus());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //TODO: rewrite
    @Override
    public Boolean testConnection() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String result = restTemplate.getForObject(uri, String.class);
            return result.equals("OK");
        } catch (Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
    }

    //TODO: delete
    @Override
    public Boolean testDBSave() {
        Author test = new Author();
        test.setName("123");
        test.setDescription("123");
        test.setBirthDate(LocalDate.now());

        authorRepository.save(test);
        Boolean result = test.getId() > 0;
        authorRepository.delete(test);
        return result;
    }

}
