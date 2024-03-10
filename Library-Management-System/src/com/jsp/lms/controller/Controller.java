package com.jsp.lms.controller;

import java.util.ArrayList;
import java.util.List;

import com.jsp.lms.model.Book;
import com.jsp.lms.model.Library;
import com.jsp.lms.view.View;

public class Controller {
	private Library library = View.getLibrary();

	public void addBook(Book book) {
		List<Book> books = library.getBook();
		if (books == null) {
			books = new ArrayList<Book>();// create a list to store books
		}
		books.add(book);
		library.setBook(books);
	}

	public boolean removeBook(String bookName) {
		Book book = getBook(bookName);
		if (book != null) { // Book Exists
			List<Book> books = library.getBook();
			boolean remove = books.remove(book);
			library.setBook(books);

			return true;
		}
		return false;
	}

	public boolean updateBook(Book bookExist, Book bookUpdate) {
		List<Book> books = library.getBook();
		for (Book book : books) {
			if (book.getBookName().equalsIgnoreCase(bookExist.getBookName())) {
				books.remove(bookExist);
				books.add(bookUpdate);
				library.setBook(books);
				return true;
			}
		}
		return false;
	}

	public Book getBook(String bookName) {
		List<Book> books = library.getBook();

		if (books != null) {
			for (Book book : books) {
				if (book.getBookName().equalsIgnoreCase(bookName)) {
					return book;
				}
			}
		}
		return null;
	}

}
