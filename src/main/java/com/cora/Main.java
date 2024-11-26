package com.cora;

public class Main {
    public static void main(String[] args) {

    // Create some Books
        Book prideAndPrejudice = new Book(1,"Pride and Prejudice", "Jane Austen", "9780451530783");
//        System.out.println(prideAndPrejudice);

        Book goneWithTheWind = new Book(2,"Gone with the Wind", "Margaret Mitchell", "9780582418066");
//        System.out.println(goneWithTheWind);

        Book theCatcherInTheRye = new Book(3, "The Catcher in the Rye", "J.D. Salinger", "9780316769488" );
//        System.out.println(theCatcherInTheRye);

        Book greatExpectations = new Book(4, "Great Expectations", "Charles Dickens", "9781503275188");
//        System.out.println(greatExpectations);

        // Create an array of Books
        Book[] initialBooks = {prideAndPrejudice, goneWithTheWind, theCatcherInTheRye, greatExpectations};

        // Create a Library
        Library library = new Library(initialBooks);

        // Print the Library (uses the overridden toString() method)
//        System.out.println(library);

        library.addBook(new Book(5,"James and the Giant Peach", "Roald Dahl", "9781512345188" ));
        System.out.println(library);

    }
}