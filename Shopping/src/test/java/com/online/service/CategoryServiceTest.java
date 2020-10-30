/*
 * package com.online.service;
 * 
 * import static org.mockito.Mockito.times; import static
 * org.mockito.Mockito.verify; import static org.mockito.Mockito.when;
 * 
 * import java.util.List; import java.util.Optional; import
 * java.util.stream.Collectors; import java.util.stream.Stream;
 * 
 * import org.junit.jupiter.api.Assertions; import org.junit.jupiter.api.Test;
 * import org.junit.jupiter.api.extension.ExtendWith; import
 * org.mockito.InjectMocks; import org.mockito.Mock; import org.mockito.Spy;
 * import org.mockito.junit.jupiter.MockitoExtension;
 * 
 * import com.online.dao.CategoryDao; import com.online.model.BookCategory;
 * 
 * @ExtendWith(MockitoExtension.class) public class CategoryServiceTest {
 * 
 * @Mock CategoryDao dao;
 * 
 * @InjectMocks CategoryService service= new CategoryServiceImpl();
 * 
 * @Spy BookCategory category;
 * 
 * @Test void test_for_list_of_Category() {
 * when(dao.findAll()).thenReturn(Stream.of(new
 * BookCategory("Book","Autoboiography","book.png",true)).collect(Collectors.
 * toList()));
 * 
 * List<BookCategory> list = service.list();
 * 
 * Assertions.assertEquals(1,list.size()); }
 * 
 * @Test void test_for_updated_list() { category.setId(1);
 * category.setImageurl("Tv");
 * 
 * when(dao.findById(category.getId())).thenReturn(Optional.of(category));
 * 
 * Optional<BookCategory> opt = service.update(category);
 * 
 * Assertions.assertEquals(category,opt.get());
 * 
 * 
 * 
 * }
 * 
 * }
 */