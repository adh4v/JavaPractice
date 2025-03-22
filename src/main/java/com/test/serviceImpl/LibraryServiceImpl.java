package com.test.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.LibraryDao;
import com.test.entity.Book;
import com.test.service.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService {
	
	@Autowired
	LibraryDao libraryDao;
	
	public void setLibraryDao(LibraryDao libraryDao) {
		this.libraryDao = libraryDao;
	}

	@Override
	public Book saveBook(Book book) {
		try 
		{
			if(book!=null)
			{
				libraryDao.saveBook(book);
			}
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
		}
		return book;
	}

	@Override
	public List<Book> getBooks(Book book) {
		List<Book> list= libraryDao.getBooks(book);
		if(list.size()<0)
		{
			System.out.println("No Content");
	
		}
		return list;
	}

	@Override
	public boolean deleteBook(int id) {
		try {
			if(id !=0)
			{
				libraryDao.deleteBook(id);
			}
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
		}
		return libraryDao.deleteBook(id);
}

	@Override
	public List<Book> getBookByID(Book book) {
		return libraryDao.getBookByID(book);
	}

	@Override
	public boolean updateBook(Book book) {
		return libraryDao.updateBook(book);
	}

	
	
	
}
