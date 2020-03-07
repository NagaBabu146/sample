package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Book;
import com.nt.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository repository;

	@Override
	public List<Book> getBooks(Integer bookId) {
		// use repository
		return (List<Book>) repository.findAll();

	}

	@Override
	public String saveBook(Book book) {
		repository.save(book);
		return "book save dwith id " + book.getBookId();

	}

	

	/*
	 * @Override public Optional<Book> getBook(Integer bookId) { //use repository
	 * Optional<Book> findById = repository.findById(bookId);
	 * 
	 * return findById; }
	 */
}
