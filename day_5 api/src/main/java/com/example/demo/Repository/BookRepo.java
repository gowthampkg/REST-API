package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.BookEntity;

public interface BookRepo extends JpaRepository<BookEntity, Integer>{

}
