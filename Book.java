/* MIT OpenCourseware Java I - Assignment 4
 * Author: Jason Gardner
 * Filename: Book.java
 * Date: January 24, 2020
 */

public class Book { //Object
    String title; //Field
    boolean borrowed; //Field

    // Creates a new Book
    public Book(String bookTitle) {//Constructor
        title = bookTitle;
    }
   
    // Marks the book as rented
    public void borrowed() {//Method (Set Borrowed)
        this.borrowed = true;
    }
   
    // Marks the book as not rented
    public void returned() { //Method (Unset Borrowed)
        this.borrowed = false;
    }
   
    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() { //Method (Get Borrowed)
        return this.borrowed;
    }
   
    // Returns the title of the book
    public String getTitle() { //Method (Get Title)
        return this.title;
    }

    public static void main(String[] arguments) { //Test
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
}
