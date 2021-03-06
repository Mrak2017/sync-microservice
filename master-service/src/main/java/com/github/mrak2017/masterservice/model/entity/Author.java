package com.github.mrak2017.masterservice.model.entity;

import com.github.mrak2017.masterservice.model.BaseEntity;
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
@Table(name = "mtr_author")
public class Author extends BaseEntity {

    @Column(length = 500)
    @NotNull
    private String name;

    @Column(length = 1000)
    @NotNull
    private String description;

    @Column
    @NotNull
    private LocalDate birthDate;

    @Column
    private LocalDate deathDate;

}
