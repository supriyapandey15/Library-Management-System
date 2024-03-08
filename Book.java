package com.jsp.lms.model;

public class Book {
	private String bookName;
	private String bookAuthor;
	private double bookPrice;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	@Override
	public String toString() {
		return "Book name=" + bookName + ", \nBook author=" + bookAuthor + ", \nBook price=" + bookPrice + " ";
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

//	public void updateBook(String BookToUpdate,String BookName,String BookAuthor,double Price) {
//		this.bookName=bookName;
//		this.bookAuthor=bookAuthor;
//		this.bookPrice=bookPrice;
//	}
}
