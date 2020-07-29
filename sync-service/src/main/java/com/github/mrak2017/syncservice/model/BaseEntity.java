package com.github.mrak2017.syncservice.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @CreationTimestamp
    private LocalDateTime insertDate;

    @Column
    @UpdateTimestamp
    private LocalDateTime updateDate;
}
