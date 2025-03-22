package com.test.dao;

import java.util.List;

import com.test.entity.Book;
import com.test.repository.LibraryRepository;


public interface LibraryDao {
	
	public Book saveBook(Book book);
	public List<Book> getBooks(Book book);
	public boolean deleteBook(int id);
	public List<Book> getBookByID(Book book);
	public boolean updateBook(Book book);
}
