package com.nt.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	

}
