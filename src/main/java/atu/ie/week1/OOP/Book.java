package atu.ie.week1.OOP;

public class Book {
    public String title;
    public String author;
    public int pageCount;
    public boolean available = true;

    public void displayDetails() {
        System.out.println("book:" + title);
        System.out.println("book:" + author);
        System.out.println("book:" + pageCount);
        System.out.println("Is this book available?" + available);
    }

}
