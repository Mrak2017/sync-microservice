package com.github.mrak2017.syncservice.controller;

import com.github.mrak2017.syncservice.controller.dto.StartSyncParamsDTO;
import com.github.mrak2017.syncservice.controller.dto.SyncCommandResultDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("sync-api/")
public class SyncRestController {

    @PostMapping()
    public SyncCommandResultDTO startSync(@RequestBody StartSyncParamsDTO dto) {
        System.out.println("Starting sync");
        return new SyncCommandResultDTO("OK");
    }

    @GetMapping()
    public String testConnection() {
        return "OK";
    }
}
