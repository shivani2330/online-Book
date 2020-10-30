package com.online;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.online.dao.BookRepository;
import com.online.model.Book;


@SpringBootApplication
public class Shopping {
	
	
	@Autowired
	private BookRepository br;

	
	public static void main(String[] args) {
		SpringApplication.run(Shopping.class, args);
	}

}
