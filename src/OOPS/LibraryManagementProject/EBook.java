package OOPS.LibraryManagementProject;

public class EBook  extends Book {
    private double fileSizeMB;

    public EBook(String title, String author, double price, double fileSizeMB) {
        // super() by using super we can call the constructor of parent class
        super(title, author, price);
        this.fileSizeMB = fileSizeMB;
    }

    // Method Overriding (Polymorphism)
    @Override
    public void displayDetails() {
        super.displayDetails(); // it shows the previous details
        System.out.println("File Size: " + fileSizeMB + " MB");
    }
}
