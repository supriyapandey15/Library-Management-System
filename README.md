#                                                                            Library Management System
The Library Management System (LMS) is a console-based project developed in Java follows Model-View-Controller (MVC) architectural pattern. This structure allows modular development, easier maintenance, and scalability. The console-based MVC LMS provides basic functionality for managing library resources and user interactions.

## Model-View-Controller (MVC):

### 1.	Model (M):
•	Represents the data and business logic.

•	Used to store entities and data logic through getter and setter.

•	Classes such as 'Book’, 'Library' manage respective entities.

### 2.	View (V):
•	Here it act as menu-driven code where user can interact.

•	Deals with the user interface.

•	Classes responsible for displaying information and interacting with the user via console.
### 3.	Controller (C):
•	It act as a mediator, handling user input, updating the models, and interacting with the view.

•	Classes like ‘Controller’ manage the flow of control, processing user commands, and co-ordinating actions.

# Entities
## Library
### Attrributes
 • LibraryName : Name of the Library
 
 • LibraryAdress : Address of the library

 • Pincode : Pincode of the library location

 • books : list of the books 

 ### Methods :
 ##### // getter methods for library information
          • getLibraryName() : Returns library name

          • getLibraryAddress() : Returns Library Address

          • getPincode() : Returns pincode of the library location

          • getBook() : Returns list of the books

 ##### // setter methods to set library details
           • setLibraryName(String LibraryName) : sets name of the library

           • setLibraryAddress(String LibraryAddress) :sets address of the library

           • setPincode(int Pincode) : sets pincode of the library location

           • setBook(List<Book> books) : sets list of books in the library
  
 
## Key Features:

•	User can add, read, update or delete books.

•	Clear separation between user interface and business logic for maintainability.

•	Transactions like performing CRUD operations are handled and updating the details accordingly.

•	Error handling for invalid inputs and ensuring data integrity.
