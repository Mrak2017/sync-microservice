package com.github.mrak2017.masterservice.model;

import com.github.mrak2017.masterservice.model.sync.Gateway;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "mtr_guided_entity")
public class GuidedEntity extends BaseEntity {

    @Column
    @NotNull
    private UUID guid;

    @ManyToOne
    @JoinColumn(name = "gateway_id", nullable = false)
    private Gateway gateway;
}
