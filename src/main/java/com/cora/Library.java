package com.cora;

import java.util.Arrays;

public class Library {
    // --------- 1. Define what properties --------- //
    // Create an array of Books (similar to how we set up other properties like: String userName;)
    private Book[] booksArray;

    // --------- 2. Set up Constructor to initialize the library --------- //
    public Library(Book[] booksArray) {
        this.booksArray = booksArray; // Assign the parameter to the class field
    }

    // --------- 3. Methods --------- //
        // Getter for booksArray
        public Book[] getBooksArray() {
            return booksArray;
        }

        // Setter for booksArray
        // same way we did:  public void setTitle(String title, Sting author ...etc)
        public void setBooksArray(Book[] booksArray) {
            this.booksArray = booksArray; // Replace the current array (use cautiously)
        }

        // Add Book method
        public void addBook(Book book) {
            int newLength = this.booksArray.length + 1;
            this.booksArray = Arrays.copyOf(this.booksArray, newLength);
            this.booksArray[newLength -1] = book;
        }

    // Override toString to display the library's books
    @Override
    public String toString() {
        return "Library{" +
                "booksArray=" + Arrays.toString(booksArray) +
                '}';
    }
}
