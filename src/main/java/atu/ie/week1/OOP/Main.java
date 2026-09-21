package atu.ie.week1.OOP;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello oop 1");

        Book firstbook = new Book();

        firstbook.title = "Dune";
        firstbook.author = "Frank";
        firstbook.pageCount = 412;

        System.out.println("First book:" + firstbook.title);
        System.out.println("First book:" + firstbook.author);
        System.out.println("First book:" + firstbook.pageCount);
        System.out.println("Is this book available?" + firstbook.available);
        System.out.println("\n");

        Book secondbook = new Book();
        secondbook.title = "Star Trek";
        secondbook.author = "Dave";
        secondbook.pageCount = 300;
        secondbook.available = true;

        secondbook.displayDetails();
        secondbook.borrowBook();
    }
}