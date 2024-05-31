/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AlexAbuHarb
 */
public class Book {

    static ArrayList<Book> booksList = new ArrayList();

    static void updateBooks(Scanner scanner) {
        boolean isMenu = true;
        while (isMenu) {
            System.out.println("----Update Menu----");
            System.out.println("1- Update Book Name");
            System.out.println("2- Update Book Author");
            System.out.println("3- Update Book price");
            System.out.println("4- Back To Main Menu");
            System.out.println("5- Exit");
            System.out.println("Enter your choice: ");

            int choiceNumber1 = scanner.nextInt();
            switch (choiceNumber1) {
                case 1:
                    System.out.println("Enter book name : ");
                    String bookName = scanner.next();
                    Book oldBook = Book.getBookByName(bookName);
                    Book newBook = Book.getBookByName(bookName);
                    if (oldBook == null) {
                        System.out.println("No book with this name !!");
                    } else {
                        System.out.println("Enter book new name : ");
                        String newName = scanner.next();

                        newBook.setName(newName);
                        if (Book.updateBook(newBook, oldBook)) {
                            System.out.println("updated successfluty");
                        } else {
                            System.out.println("updated fails");

                        }

                    }

                    break;

                case 2:
                    System.out.println("Enter book name : ");
                    String bookName1 = scanner.next();
                    Book oldBook1 = Book.getBookByName(bookName1);
                    Book newBook1 = Book.getBookByName(bookName1);
                    if (oldBook1 == null) {
                        System.out.println("No book with this name !!");
                    } else {
                        System.out.println("Enter book new author : ");
                        String newAuthor = scanner.next();

                        newBook1.setAuthor(newAuthor);
                        if (Book.updateBook(newBook1, oldBook1)) {
                            System.out.println("updated successfluty");
                        } else {
                            System.out.println("updated fails");

                        }

                    }

                    break;

                case 4:
                    isMenu = false;

                    break;
                case 5:
                    Main.existFromApp();
                    break;

            }
        }
    }

    static boolean deleteBook(Book book) {
        if(!booksList.isEmpty()){
            booksList.remove(book);
            return true;
        }
        return false;
    }

    static void deleteBook2(Scanner scanner) {
        System.out.println("Enter Name Book ");
        String bookName = scanner.next();
        Book book = Book.getBookByName(bookName);
        if (book == null) {
            System.out.println("No book founded !! ");
        } else {
            //delete
            if (Book.deleteBook(book)) {
                System.out.println("deleted successfuly");
            } else {
                System.out.println("deleted fails");

            }
        }
    }

    private String name;
    private double price;
    private String author;

    Book() {

    }

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void displayAllBook() {
        ArrayList<Book> listBook = Book.booksList;
        if (listBook.isEmpty()) {
            System.out.println("There is no data !!");
        } else {
            System.out.println("Name            Author                    Price");
            for (Book book : listBook) {
                System.out.println(book.getName() + "            "
                        + book.getAuthor() + "                  " + book.getPrice());
            }
        }
    }

    public static void addBooks(Scanner scanner) {
        System.out.println("Enter The Count of book : ");
        int countBook = scanner.nextInt();
        if (countBook < 0) {
            System.out.println("Not Valid, the count must be > 0");
        } else {
            for (int i = 0; i < countBook; i++) {
                System.out.println("Enter Book " + (i + 1) + " name");
                String nameBook = scanner.next();
                System.out.println("Enter Book " + (i + 1) + " author");
                String authorBook = scanner.next();
                System.out.println("Enter Book " + (i + 1) + " price");
                double priceBook = scanner.nextDouble();

                Book b = new Book();
                b.setName(nameBook);
                b.setAuthor(authorBook);
                b.setPrice(priceBook);

                Book.booksList.add(b);
            }
        }

    }

    public static Book getBookByName(String name) {

        for (Book book : booksList) {
            if (book.name.equals(name)) {
                return book;
            }
        }

        return null;

    }

    public static boolean updateBook(Book newBook, Book oldBook) {
        if (booksList.size() > 0) {
            int index = -1;
            for (int i = 0; i < booksList.size(); i++) {
                if (booksList.get(i).getName().equals(oldBook.getName())) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                booksList.get(index).setName(newBook.getName());
                booksList.get(index).setAuthor(newBook.getAuthor());
                booksList.get(index).setPrice(newBook.getPrice());

                return true;
            }
        }

        return false;
    }

}
