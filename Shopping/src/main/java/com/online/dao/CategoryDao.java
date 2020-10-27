package com.online.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.model.BookCategory;


public interface CategoryDao extends JpaRepository<BookCategory,Integer> {

	
	

}
