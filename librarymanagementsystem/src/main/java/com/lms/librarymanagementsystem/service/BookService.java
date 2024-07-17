package com.lms.librarymanagementsystem.service;

import java.util.List;

import com.lms.librarymanagementsystem.entity.Book;

public interface BookService {
	
	public List<Book> findAll();
	public Book saveBook(Book book);
	public Book borrowBook(Long bookId,Long userId);
	public Book returnBook(Long bookId);
	void deleteBook(Long id);
	Book getBook(Long id);
	

}
