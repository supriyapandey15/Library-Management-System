package com.jsp.lms.view;

import java.util.Scanner;

import com.jsp.lms.controller.Controller;
import com.jsp.lms.model.Book;
import com.jsp.lms.model.Library;

public class View {
	private static final String BookToUpdate = null;
	static private Library library = new Library();

	public static Library getLibrary() {
		return library;
	}

	public static void setLibrary(Library library) {
		View.library = library;
	}

	static Scanner myInput = new Scanner(System.in);
	static Controller controller = new Controller();
	static {
		System.out.println("----------------Welcome to Library Management System----------------------");
		System.out.print("Enter name of the libray :");
		String libraryName = myInput.nextLine();
		library.setLibraryName(libraryName);
		System.out.print("Enter library address :");
		library.setLibraryAddress(myInput.nextLine());

		System.out.print("Enter pincode :");
		library.setPincode(myInput.nextInt());
		myInput.nextLine();
	}

	public static void main(String[] args) {
		do {
			System.out.println("Select options to perform : ");
			System.out.println("1Add book\n2.Remove book\n3.Update book\n4.Get book\n0.Exit");
			System.out.print("Enter digit respective to desired option :");
			byte userChoice = myInput.nextByte();
			myInput.nextLine();
			switch (userChoice) {
			case 0:
				myInput.close();
				System.out.println("-----------------------------------E X I T E D-------------------------------------");
				System.exit(0);
				break;
			case 1:
				Book book = new Book();
				System.out.print("Enter name of the book :");
				book.setBookName(myInput.nextLine());
				System.out.print("Enter Author's name :");
				book.setBookAuthor(myInput.nextLine());
				System.out.print("Enter price of the book :");
				book.setBookPrice(myInput.nextDouble());
				controller.addBook(book);

				if (book != null) // to check whether book added or not
				{
					System.out.println("Book added Succesfully.........");
				}

				break;
			case 2:
				System.out.print("Enter book to remove : ");
				String BookToRemove = myInput.nextLine();
				if (controller.removeBook(BookToRemove)) { // To check whether book removed or not
					System.out.println("Requested book has been Removed......");
				} else
					System.out.println("Book does not exist \n Hence Book cannot be removed........");

				break;
			case 3:
				System.out.println("Enter Book Name :");
				Book bookExist = controller.getBook(myInput.nextLine());
				if (bookExist != null) {                          //To check whether book exist or not
					Book bookUpdate = bookExist;
					System.out.println("What to update ?: ");

					System.out.println("1.Book Name  \n2.Author Name \n3.Book Price ");
					System.out.print("Enter respective digit given :");
					byte userWish = myInput.nextByte();
					myInput.nextLine();

					switch (userWish) {
					case 1:
						System.out.print("Enter New Book name :");
						bookUpdate.setBookName(myInput.nextLine());

						break;
					case 2:
						System.out.print("Enter New Author name :");
						bookUpdate.setBookAuthor(myInput.nextLine());
						break;
					case 3:
						System.out.print("Enter Book's price you want to change :");
						double newBookPrice = myInput.nextDouble();
						bookUpdate.setBookPrice(newBookPrice);
						myInput.nextLine();

						break;

					default:
						System.out.println("........................Please select valid option.......................");
						myInput.nextLine();
						break;
					}

					if (controller.updateBook(bookExist, bookUpdate)) {   
						System.out.println("Book Updated....");
					} else {
						System.out.println("Book not Updated..........");
					}

				}

			case 4:
				System.out.print("Enter Book name you are looking for :");
				Book fetchedBook = controller.getBook(myInput.nextLine());

				if (fetchedBook != null)                              // Details of book by its name
				{
					System.out.println("Book is available...");
					System.out.println("Details....");
					System.out.println(fetchedBook);
				} else
					System.out.println("Book is not available....");
				break;

			default:
				System.out.println("Invalid selection.....");
				break;
			}

		} while (true);
	}

}
