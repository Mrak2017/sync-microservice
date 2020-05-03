package com.github.mrak2017.masterservice;

import com.github.mrak2017.masterservice.service.SyncManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MasterServiceApplication {

    @Autowired
    SyncManagerService service;

    public static void main(String[] args) {
        SpringApplication.run(MasterServiceApplication.class, args);
    }

    //TODO: delete
    @Scheduled(fixedDelay = 15000)
    private void testConnection() {
        if (!service.testConnection()) {
            throw new RuntimeException("Error test connection failed");
        } else {
            System.out.println("Connection test: OK");
        }
        //service.startSync();
    }

    //TODO: delete
    @PostConstruct
    private void onPostConstruct() {
        if (!service.testDBSave()) {
            throw new RuntimeException("Error saving to db");
        } else {
            System.out.println("DB test: OK");
        }
    }
}
