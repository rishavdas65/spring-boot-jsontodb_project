package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Book;
import com.example.repository.BookRepository;

@Service
public class BookService {

    @Autowired
	private BookRepository bookRepository;

    public Iterable<Book> list() {
        return bookRepository.findAll();
    }
    public void save(List<Book> book) {
    	
        bookRepository.saveAll(book);
    }
}
