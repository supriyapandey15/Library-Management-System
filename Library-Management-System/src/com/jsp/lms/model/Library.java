package com.jsp.lms.model;

import java.util.List;

public class Library {
	private String libraryName;
	private String libraryAddress;
	private int pincode;

	 private List<Book> books;

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLibraryAddress() {
		return libraryAddress;
	}

	public void setLibraryAddress(String libraryAddress) {
		this.libraryAddress = libraryAddress;
	}

	@Override
	public String toString() {
		return "libraryName=" + libraryName + ", libraryAddress=" + libraryAddress + ", pincode=" + pincode
				+ ", books=" + books ;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public List<Book> getBook() {
		return books;
	}

	public void setBook(List<Book> books) {
		this.books = books;
	}
}
