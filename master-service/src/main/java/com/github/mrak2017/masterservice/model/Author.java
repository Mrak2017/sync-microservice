package com.github.mrak2017.masterservice.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "mtr_simple_entity")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private LocalDate publishDate;

    public Long getId() {
        return id;
    }
}
