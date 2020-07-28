package com.github.mrak2017.masterservice.model.entity;

import com.github.mrak2017.masterservice.model.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "mtr_book")
public class Book  extends BaseEntity {

    @Column(length = 500)
    @NotNull
    private String name;

    @Column(length = 1000)
    @NotNull
    private String description;

    @Column
    @NotNull
    private LocalDate publishDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author", nullable = false)
    private Author author;
}
