package com.online.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.model.Book;
import com.online.model.BookCategory;

@Repository
public interface CategoryDao extends JpaRepository<BookCategory,Integer> {
	

	
}
