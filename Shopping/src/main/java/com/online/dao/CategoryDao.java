package com.online.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.model.BookCategory;

@Repository
public interface CategoryDao extends JpaRepository<BookCategory,Long> {

	
	

}
