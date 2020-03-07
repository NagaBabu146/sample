package com.nt.service;

import java.util.List;

import com.nt.model.Book;

public interface BookService {

	public List<Book> getBooks(Integer bookId);
	//public Book getBook(Integer bookId);
	public String saveBook(Book book);
	//public List<Book> removeBook(int bookId);
}
