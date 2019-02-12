package com.twu.biblioteca;

import java.util.*;

public class BibliotecaApp {
    private static Library library = new Library();

    public static void main(String[] args) {
        welcomeCustomer();
        boolean flag = true;
        while (flag) {
            switch (selectMenu()) {
                case 1:
                    List<Book> books = new ArrayList<Book>();
                    library.setBooks(books);
                    library.printBooks();
                    flag = false;
                    break;
                default:
                    System.out.println("Please select a valid option!");
            }
        }
    }

    public static void welcomeCustomer() {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }

    public static int selectMenu() {
        System.out.println("Please select an option:");
        System.out.println("1.List of books");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        return option;
    }
}
