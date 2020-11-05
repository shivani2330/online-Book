package com.online.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.model.Book;

public interface BookDao extends JpaRepository<Book,Integer>{
	
	List<Book> findByCategoryId(int id); 

}
