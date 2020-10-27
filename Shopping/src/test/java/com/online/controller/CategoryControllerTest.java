package com.online.controller;

import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.online.model.BookCategory;
import com.online.service.CategoryService;
import com.online.service.CategoryServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CategoryControllerTest {

	@Mock
	CategoryService service = new CategoryServiceImpl();
	
	@InjectMocks
	CategoryController controller;
	
	@Spy
	BookCategory category;
	
	@Test
	void test_fro_controller()
	{
		when(service.list()).thenReturn(Stream.of(new BookCategory("Book","Autoboiography","book.png",true)).collect(Collectors.toList()));
		List<BookCategory >list = (List<BookCategory>) controller.getlist().getBody();
		Assertions.assertEquals(1,list.size());
	}
	
	@Test
	void test_for_update()
	{
		category.setId(1);
		category.setName("Clothes");
		
		when(service.update(category)).thenReturn(Optional.of(category));
		
		Assertions.assertEquals(category,controller.get_UpdatedList(1, category).getBody().get());
		
	}
	
}
