package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Book;
import com.test.service.LibraryService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class LibraryController {
	
	@Autowired
	private LibraryService service;
	
	public void setService(LibraryService service) {
		this.service = service;
	}

	@PostMapping("/save-book")
	public Book saveBook(@RequestBody Book book) {
		 return service.saveBook(book);
		
	}
	
	@GetMapping("/book-list")
	public List<Book> getBooks(@RequestBody Book book){
		return service.getBooks(book);
	}
	
	
	@DeleteMapping("/delete-book/{book_id}")
	public boolean deleteBook(@PathVariable("book_id") int book_id,Book book) {
		book.setBook_id(book_id);
		return service.deleteBook(book_id);
	}

	@GetMapping("/book/{book_id}")
	public List<Book> getBookByID(@PathVariable("book_id") int book_id,Book book) {
		 book.setBook_id(book_id);
		 return service.getBookByID(book);
		
	}
	
	@PostMapping("/update-book/{book_id}")
	public boolean updateBook(@RequestBody Book book,@PathVariable("book_id") int book_id) {
		book.setBook_id(book_id);
		return service.updateBook(book);
	}
}
