package com.github.mrak2017.masterservice.repository;

import com.github.mrak2017.masterservice.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
