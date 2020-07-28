package com.github.mrak2017.masterservice.model.sync;

import com.github.mrak2017.masterservice.model.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "mtr_gateway")
public class Gateway extends BaseEntity {

    @Column(length = 10)
    @NotNull
    private String code;

    @Column(length = 500)
    private String name;

    @Column(name = "last_sync_date")
    private LocalDateTime lastSyncDate;
}
