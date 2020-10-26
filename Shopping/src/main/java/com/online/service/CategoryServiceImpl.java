package com.online.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.online.dao.CategoryDao;
import com.online.model.Category;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryDao dao;

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Optional<Category> update(Category category) {
		// TODO Auto-generated method stub
	     Optional<Category> categorydb = dao.findById(category.getId());
	     
	     if(categorydb.isPresent())
	     {
	    	 Category cat = categorydb.get();
	    	 cat.setId(category.getId());
	    	 cat.setName(category.getName());
	    	 cat.setImageurl(category.getImageurl());
	    	 cat.setDescription(category.getDescription());
	    	 cat.setIsactive(category.isIsactive());
	    	 dao.save(cat);
	    	 
	    	 
	     }
	     else {
	            System.out.println("Record not found with id : " +category.getId());
	        }
		return categorydb;
	}

	
}