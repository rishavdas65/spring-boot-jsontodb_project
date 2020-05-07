package com.example;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.controller.BookController;
import com.example.service.BookService;

@RunWith(SpringJUnit4ClassRunner.class)
public class BookControllerTest {

	@Mock
	private BookService bookService;
	@InjectMocks
	BookController bookController;
	
	@Test
	public void list()
	{
		List list = new ArrayList<>();
		list.add("abc");
		when(bookService.list()).thenReturn(list);
		bookController.list();
		assertNotNull(bookService);
	}
	

}
