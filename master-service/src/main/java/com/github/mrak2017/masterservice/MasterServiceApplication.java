package com.github.mrak2017.masterservice;

import com.github.mrak2017.masterservice.service.SyncManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
public class MasterServiceApplication {

    @Autowired
    SyncManagerService service;

    public static void main(String[] args) {
        SpringApplication.run(MasterServiceApplication.class, args);
        System.out.println("Hello world from master");
    }

    @Scheduled(fixedDelay = 15000)
    private void test() {
        service.testConnection();
        //service.startSync();
    }
}
