package com.github.mrak2017.masterservice.repository;

import com.github.mrak2017.masterservice.model.SimpleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimpleEntityRepository extends JpaRepository<SimpleEntity, Long> {
}
