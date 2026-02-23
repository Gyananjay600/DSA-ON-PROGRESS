package OOPS.LibraryManagementProject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Polymorphism: it stores the book and ebook by using  LibraryItem reference.
        List<LibraryItem> myLibrary = new ArrayList<>();

        myLibrary.add(new Book("Head First Java", "Kathy Sierra", 950.0));
        myLibrary.add(new EBook("Java Deep Dive", "James Gosling", 500.0, 15.5));

        System.out.println("Welcome to the Industry Standard Library System!");
        System.out.println("==============================================");

        // shows the all item by using loop
        for (LibraryItem item : myLibrary) {
            item.displayDetails();
            System.out.println();
        }
    }
}
