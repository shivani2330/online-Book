package com.online.service;

import java.util.List;
import java.util.Optional;

import com.online.model.Category;

public interface CategoryService {
	
	List<Category> list();
	Optional<Category> update(Category category);

}
