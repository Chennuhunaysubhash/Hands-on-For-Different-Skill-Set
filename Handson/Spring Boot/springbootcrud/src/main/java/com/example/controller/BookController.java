package com.example.controller;



import java.util.ArrayList;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Book;
import com.example.service.BookServiceImpl;



@RestController
public class BookController {

	@Autowired
	BookServiceImpl bookServiceImpl;

	@PostMapping("/")
	public void addBook(@RequestBody Book book) {
		bookServiceImpl.addBook(book);
	}

	@GetMapping("/findall")
	public HashSet<Book> getAllBook() {
		return bookServiceImpl.findAllBook();
	}

	@GetMapping("/findbyid/{id}")
	public Book geBookById(@PathVariable long id) {
		return bookServiceImpl.findBookByID(id);
	}

	@DeleteMapping("/delete")
	public void deleteBook() {
		bookServiceImpl.deleteAllData();
	}

}
