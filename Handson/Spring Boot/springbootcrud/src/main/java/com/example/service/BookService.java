package com.example.service;


import java.util.HashSet;

import com.example.entity.Book;


public interface BookService {
	HashSet<Book> findAllBook();
	Book findBookByID(long id);
	void addBook(Book b);
	void deleteAllData();
}
