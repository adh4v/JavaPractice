package com.test.libraryDaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dao.LibraryDao;
import com.test.entity.Book;
import com.test.repository.LibraryRepository;

@Repository
public class LibraryDaoImpl implements LibraryDao{
	@Autowired
	LibraryRepository repo;
	

	public void setRepo(LibraryRepository repo) {
		this.repo = repo;
	}

	@Override
	public Book saveBook(Book book) {
		return repo.save(book);
	}

	@Override
	public List<Book> getBooks(Book book) {
		repo.save(book);
		return repo.findAll();
	}

	@Override
	public boolean deleteBook(int id) {
		boolean status=false;
		try {
			repo.deleteById(id);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Book> getBookByID(Book book) {

		return repo.findAll();
	}

	@Override
	public boolean updateBook(Book book) {
		boolean status=false;
		try {
			repo.save(book);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	
	
}
