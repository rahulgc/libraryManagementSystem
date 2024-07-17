package com.lms.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.librarymanagementsystem.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long> {

}
