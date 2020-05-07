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

import com.example.domain.Book;
import com.example.repository.BookRepository;
import com.example.service.BookService;

@RunWith(SpringJUnit4ClassRunner.class)
public class BookServiceTest {
	
	@InjectMocks
	BookService bookService;
	@Mock
	BookRepository bookRepository;
	
	@Test
	public void list()
	{
		List<Book> listBook = new ArrayList<>();
		Book book = new Book();
		book.setAuthor("author");
		listBook.add(book);
		when(bookRepository.saveAll(listBook)).thenReturn(listBook);
		bookService.save(listBook);
		assertNotNull(listBook);
	}
	

}
