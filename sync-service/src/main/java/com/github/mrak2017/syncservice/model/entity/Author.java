package com.github.mrak2017.syncservice.model.entity;

import com.github.mrak2017.syncservice.model.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "snc_author")
public class Author extends BaseEntity {

    @Column
    @NotNull
    private String name;

    @Column
    @NotNull
    private String description;

    @Column
    @NotNull
    private LocalDate birthDate;

    @Column
    private LocalDate deathDate;

}
