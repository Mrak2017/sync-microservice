package com.github.mrak2017.syncmicroservice;

import com.github.mrak2017.syncmicroservice.service.SyncManagerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MasterServiceApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(MasterServiceApplication.class, args);
		System.out.println("Hello world from master");

		SyncManagerService service = applicationContext.getBean(SyncManagerService.class);
		service.startSync();
	}
}
