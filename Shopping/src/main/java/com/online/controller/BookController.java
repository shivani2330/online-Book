package com.online.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.online.dao.BookDao;
import com.online.dao.CategoryDao;
import com.online.model.Book;
import com.online.model.BookCategory;

/*@CrossOrigin(origins = "http://localhost:4200")*/
@RestController
public class BookController {
	
	@Autowired
	private CategoryDao dao;
	
	@Autowired
	private BookDao bookdao;
	
	@GetMapping("/books")
	public ResponseEntity<?> list()
	{
	   List<Book> list =  bookdao.findAll();
	   
	   return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/books/{id}")
	public Optional<Book> listById(@PathVariable("id")int id)
	{
		
		return bookdao.findById(id);
	   
	}
	
	@GetMapping("/category")
	public ResponseEntity<?> listofCategory()
	{
	   List<BookCategory> list =  dao.findAll();
	   
	   return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/category/{id}")
	public Optional<BookCategory> listofCategoryById(@PathVariable("id")Integer id)
	{
	     return dao.findById(id);
	   
	   
	}
	

	@GetMapping("/findCategoryById/{id}")
	
	public ResponseEntity<?> listByCategory(@PathVariable("id")int id)
	{
		List<Book> list = bookdao.findByCategoryId(id);
		return ResponseEntity.ok().body(list);
	}
	
}
