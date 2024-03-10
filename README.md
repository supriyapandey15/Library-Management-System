#                                                                            Library Management System
The Library Management System (LMS) is a console-based project developed in Java follows Model-View-Controller (MVC) architectural pattern. This structure allows modular development, easier maintenance, and scalability. The console-based MVC LMS provides basic functionality for managing library resources and user interactions.

## How to install, compile and run java program  :
##### 1. Install Java DEvelopment Kit (JDK):
  Download and install JDK from the official Oracle website or an alternative website like OpenJDK.
  
  Set the **"JAVA_HOME'** environment variable to point to the JDK installation directory.
##### 2. Write a Java Program :
 Create a new text file with a **'.java'** extension,
 
 for example : **HelloWorld.java**.

 ##### 3.Compile Java Code:
 Open command prompt

 Navigate the directory containing java file

 Now,Compile the code using **'javac'** command 
 
               Command: javac HelloWorld.java
     
This will create .class file.

##### 4. Run the Java Program :
 After successfull compilation, run the program using **'java'** commanad.
 
                 Command : java HelloWorld

Ensure that the class name passed to **java** matches the name of the file containing the **'main'** method.


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
 ##### // getter and setter methods for library information
          • getLibraryName() : Returns library name

           • setLibraryName(String libraryName) : sets name of the library

           • getLibraryAddress() : Returns Library Address

           • setLibraryAddress(String libraryAddress) :sets address of the library
           
           • getPincode() : Returns pincode of the library location

           • setPincode(int pincode) : sets pincode of the library location
           
           • getBook() : Returns list of the books
           
           • setBook(List<Book>books) : sets list of books in the library    
           
  ## Books
  ### Attrributes
  
    • bookName : Name of the book
   
    • bookAuthor : Author's name of that book
  
    • bookPrice : Price of the book

   ### Methods :
          • getBookName() : Returns book name
          
          • setBookName(String bookName) : sets name of the library
          
          • getBookAuthor() : Returnsbook Author's name
          
          • setBookAuthor(String bookAuthor) :sets Author's name of the book
          
          • getBookPrice() : Returns price of the book
          
          • setBookPrice(int pincode) : sets price of the book
          
          • toString(): returns string representation of book details

          
 
## Key Features:

•	User can add, read, update or delete books.

•	Clear separation between user interface and business logic for maintainability.

•	Transactions like performing CRUD operations are handled and updating the details accordingly.

•	Error handling for invalid inputs and ensuring data integrity.


# OUTPUT 


<img width="839" alt="lms" src="https://github.com/supriyapandey15/Library-Management-System/assets/113895235/8a6efec9-f935-46d1-8f74-cac10ad9358e">





<img width="826" alt="lms1" src="https://github.com/supriyapandey15/Library-Management-System/assets/113895235/61b668ee-1988-4b3f-8a9a-d412fb962048">
