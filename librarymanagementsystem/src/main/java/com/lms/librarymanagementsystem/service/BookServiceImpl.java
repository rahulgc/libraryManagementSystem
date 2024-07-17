package com.lms.librarymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.librarymanagementsystem.entity.Book;
import com.lms.librarymanagementsystem.entity.User;
import com.lms.librarymanagementsystem.repository.BookRepository;
import com.lms.librarymanagementsystem.repository.UserRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository br;
	
	@Autowired
	private UserRepository ur;

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return br.findAll();
	}

	@Override
	public Book getBook(Long id) {
		// TODO Auto-generated method stub
		return br.findById(id).orElse(null);
	}

	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return br.saveAndFlush(book);
	}

	@Override
	public void deleteBook(Long id) {
		// TODO Auto-generated method stub
		br.deleteById(id);
		
	}

	@Override
	public Book borrowBook(Long bookId, Long userId) {
		// TODO Auto-generated method stub
		Book book=this.getBook(bookId);
		User user=ur.findById(userId).orElse(null);
		
		if(book!=null && !book.isBorrowed() && user!=null) {
			book.setBorrowedBy(user);
			book.setBorrowed(true);
			return this.saveBook(book);
		}
		
		return null;
	}

	@Override
	public Book returnBook(Long bookId) {
		// TODO Auto-generated method stub
		Book book=this.getBook(bookId);
		if(book!=null && book.isBorrowed()) {
			book.setBorrowed(false);
			book.setBorrowedBy(null);
			return this.saveBook(book);
		}
		return null;
	}

}
