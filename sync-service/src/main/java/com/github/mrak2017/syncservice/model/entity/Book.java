package com.github.mrak2017.syncservice.model.entity;

import com.github.mrak2017.syncservice.model.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "snc_book")
public class Book extends BaseEntity {

    @Column
    @NotNull
    private String name;

    @Column
    @NotNull
    private String description;

    @Column
    @NotNull
    private LocalDate publishDate;

    @Column
    @NotNull
    private UUID authorGuid;
}
