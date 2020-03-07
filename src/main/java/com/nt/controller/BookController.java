package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Book;
import com.nt.service.BookService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class BookController {
	@Autowired
	private BookService service;
    @PostMapping("/save")
    @ApiOperation(value="store Book Api")
	public String saveBook(@RequestBody Book book) {
    	service.saveBook(book);
		return "succesfully saved";
    	
    }
    @GetMapping("/all{bookId}")
    @ApiOperation(value = "search Book Api by Id",
                  notes = "Provide an id to look up specific Book",
                  response = Book.class)
    public List<Book> getAll(@PathVariable Integer bookId) {
    	return service.getBooks(bookId);
    }
    
}
