package com.github.mrak2017.masterservice.service;

public interface SyncManagerService {
    void startSync();

    Boolean testConnection();

    Boolean testDBSave();
}
