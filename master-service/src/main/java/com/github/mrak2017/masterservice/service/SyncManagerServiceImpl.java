package com.github.mrak2017.masterservice.service;

import com.github.mrak2017.masterservice.dto.StartSyncParamsDTO;
import com.github.mrak2017.masterservice.dto.SyncCommandResultDTO;
import com.github.mrak2017.masterservice.model.Author;
import com.github.mrak2017.masterservice.repository.AuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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

    @Override
    public Boolean testConnection() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String result = restTemplate.getForObject(uri, String.class);
            System.out.println(result);
            return result.equals("OK");
        } catch (Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean testDBSave() {
        Author test = new Author();

        authorRepository.save(test);
        return test.getId() > 0;
    }

}
