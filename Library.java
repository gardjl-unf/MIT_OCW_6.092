/* MIT OpenCourseware Java I - Assignment 4
 * Author: Jason Gardner
 * Filename: Library.java
 * Date: January 24, 2020
 */

import java.util.*;

public class Library { // Object
    // Add the missing implementation to this class
    String libraryAddress; //Field
    ArrayList<Book> books; //Field
    String hours; //Field
    
    public Library(String address) { //Constructor
        libraryAddress = address; //Library Address
        books = new ArrayList<Book>(); //Blank ArrayList of Book Objects
        hours = "9:00AM to 5:00PM Daily"; //Hours with a Default Value
    }
    public void addBook(Book book) { //Method (Add a Book)
        this.books.add(book); //In ArrayList books, add a Book object book
    }
    public void printAddress() { //Method (Print Address)
        System.out.printf("Library Address: %s\n", this.libraryAddress);
    }
    public void printOpeningHours() { //Method (Print Hours)
        System.out.printf("Library at %s Hours: %s\n", this.libraryAddress, this.hours);
    }
    public void borrowBook(String book) {
        for (Book b : this.books) {
            if (b.title == book && !b.isBorrowed()) {
                b.borrowed();
                System.out.printf("You borrowed \"%s\" from the library at %s Enjoy your book!\n", book, this.libraryAddress);
            }
            else if (b.title == book && b.isBorrowed()) {
                System.out.printf("The library at %s does not have a copy of \"%s\" available for lending.\n", this.libraryAddress, book);
            }
        }
    }
    public void returnBook(String book) {
        for (Book b : this.books) {
            if (b.title == book) {
                b.borrowed = false;
                System.out.printf("\"%s\" has been returned.\n", book);
            }
        }
    }
    public void printAvailableBooks() {
        System.out.printf("The library at %s has the following books:\n", this.libraryAddress);
        for (Book b : this.books) {
            System.out.printf("%s\n", b.title);
        }
    }
    
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        firstLibrary.printOpeningHours();
        secondLibrary.printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}
