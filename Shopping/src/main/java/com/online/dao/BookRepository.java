package com.online.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.online.model.Book;

@CrossOrigin("http://localhost:4200")
public interface BookRepository extends JpaRepository<Book,Long> {

}
