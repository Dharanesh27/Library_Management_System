# Library Management System (Java OOP)

## Overview

This is a simple Library Management System developed in Java using Object-Oriented Programming (OOP) concepts. The project demonstrates core OOP principles such as Encapsulation, Class Interaction, and Data Management using ArrayLists.

## Features

* Add books to the library
* Issue books to users
* Return issued books
* Check book availability
* Display all books in the library
* Manage multiple users

## Technologies Used

* Java
* OOP Concepts
* ArrayList Collection Framework

## Project Structure

```
Library_Management_System/
│
├── Book.java
├── Library.java
├── User.java
└── Main.java
```

### Classes

#### Book

Represents a book in the library.

Attributes:

* Title
* Author
* Book ID
* Availability Status

Methods:

* display()
* isAvailable()
* getTitle()
* getAuthor()
* getId()
* setAvailability()

#### Library

Manages all books in the library.

Methods:

* addBook()
* issueBook()
* acceptBook()
* display()

#### User

Represents a library user.

Methods:

* borrowBook()
* returnBook()

#### Main

Driver class used to test the functionality of the system.

## Sample Output

```
Netflix Added to library.
Amazon Added to library.

User: 1 borrowing the book.
Book issued: Netflix

User: 1 returning book.
Book: Amazon not issued to the user1.

--Library Books---
Netflix | ABC | 1 | Issued
Amazon | BCA | 2 | Available
```

## OOP Concepts Demonstrated

* Encapsulation
* Objects and Classes
* Method Interaction
* Data Abstraction
* Collection Framework (ArrayList)

## Future Enhancements

* Search books by title or author
* Store user borrowing history
* Fine calculation for late returns
* File-based data storage
* Database integration
* Admin and User roles

## Author

Dharanesh
B.Tech Artificial Intelligence and Data Science
