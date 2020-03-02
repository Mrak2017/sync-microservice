package com.github.mrak2017.syncmicroservice.controller.dto;

public class SyncCommandResultDTO {

    // TODO: enum here
    private String status;

    public SyncCommandResultDTO(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
