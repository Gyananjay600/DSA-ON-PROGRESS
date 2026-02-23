package OOPS.LibraryManagementProject;

public class Book implements LibraryItem {
    private String title;
    private String author;
    private double price;

    // Constructor: sends the data when object will create
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Book Details ---");
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : ₹" + price);
    }
}
