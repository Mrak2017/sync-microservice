package com.github.mrak2017.syncservice.model;

import com.github.mrak2017.syncservice.model.sync.Gateway;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "snc_guided_entity")
public class GuidedEntity extends BaseEntity {

    @Column
    @NotNull
    private UUID guid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gateway", nullable = false)
    private Gateway gateway;
}
