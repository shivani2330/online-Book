package com.online.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.model.Book;

public interface BookRepository extends JpaRepository<Book,Long> {

}
