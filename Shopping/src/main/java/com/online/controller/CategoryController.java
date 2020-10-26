package com.online.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.model.Category;
import com.online.service.CategoryService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {
	
	@Autowired
	CategoryService service;
	
	@GetMapping("/category")
	public ResponseEntity<?> getlist()
	{
		List<Category> list = service.list();
		return ResponseEntity.ok().body(list);
	}
	
	@PutMapping("category/{id}")
	public ResponseEntity<Optional<Category>> get_UpdatedList(@PathVariable("id")int id,@RequestBody Category category)
	{
		category.setId(id);
		return ResponseEntity.ok().body(this.service.update(category));
	}
}
