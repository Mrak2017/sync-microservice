package com.github.mrak2017.syncservice.controller.dto;

import java.time.LocalDateTime;

public class StartSyncParamsDTO {
    private LocalDateTime lastSyncDateTime;

    public LocalDateTime getLastSyncDateTime() {
        return lastSyncDateTime;
    }

    public void setLastSyncDateTime(LocalDateTime lastSyncDateTime) {
        this.lastSyncDateTime = lastSyncDateTime;
    }
}
