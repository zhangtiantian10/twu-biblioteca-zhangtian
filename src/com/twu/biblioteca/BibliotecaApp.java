package com.twu.biblioteca;

import java.util.*;

public class BibliotecaApp {

    public static void main(String[] args) {
        welcomeCustomer();

        Library library = new Library();
        List<Book> books = getBooks();
        library.setBooks(books);

        while (true) {
            switch (selectMenu()) {
                case 1:
                    library.printBooks();
                    break;
                case 2:
                    String name = inputBookName();
                    checkoutBook(name, library);
                    break;
                case 3:
                    name = inputBookName();
                    returnBook(name, library);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Please select a valid option!");
            }
        }

    }

    public static void returnBook(String name, Library library) {
        boolean result = library.returnBook(name);
        String message = result ? "Thank you for returning the book." : "That is not valid book to return.";

        System.out.println(message);
    }

    public static void checkoutBook(String name, Library library) {
        boolean result = library.checkoutBook(name);
        String message = result ? "Thank you! Enjoy the book" : "Sorry, that book is not available";
        System.out.println(message);
    }

    public static void welcomeCustomer() {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }

    public static int selectMenu() {
        System.out.println("Please select an option:");
        System.out.println("1.List of books");
        System.out.println("2.Checkout book");
        System.out.println("3.Return book");
        System.out.println("4.Exit");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        return option;
    }

    public static String inputBookName() {
        System.out.println("Please input book name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        return name;
    }

    private static List<Book> getBooks() {
        List<Book> books = new ArrayList<Book>();
        for (int i = 1; i < 5; i ++) {
            books.add(new Book("Book" + i, "zhang", "2017"));
        }

        return books;
    }
}
