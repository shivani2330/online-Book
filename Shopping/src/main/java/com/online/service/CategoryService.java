package com.online.service;

import java.util.List;
import java.util.Optional;

import com.online.model.BookCategory;

public interface CategoryService {
	
	List<BookCategory> list();
	Optional<BookCategory> update(BookCategory category);

}
