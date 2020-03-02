package com.github.mrak2017.syncmicroservice.controller;

import com.github.mrak2017.syncmicroservice.controller.dto.StartSyncParamsDTO;
import com.github.mrak2017.syncmicroservice.controller.dto.SyncCommandResultDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sync/")
public class SyncRestController {

    @PostMapping()
    SyncCommandResultDTO startSync(@RequestBody StartSyncParamsDTO dto) {
        System.out.println("Starting sync");
        return new SyncCommandResultDTO("OK");
    }
}
