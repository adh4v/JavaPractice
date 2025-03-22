package com.test.service;

import java.util.List;

import com.test.entity.Book;


public interface LibraryService {
	public Book saveBook(Book book);
	public List<Book> getBooks(Book book);
	public boolean deleteBook(int id);
	public List<Book> getBookByID(Book book);
	public boolean updateBook(Book book);
}
