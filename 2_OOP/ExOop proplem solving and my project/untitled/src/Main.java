
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.util.Scanner;

/**
 *
 * @author AlexAbuHarb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----Main Menu----");
            System.out.println("1_Display all book");
            System.out.println("2_Add Book");
            System.out.println("3_Update book");
            System.out.println("4_Delete book");
            System.out.println("5_Search book");
            System.out.println("6_Exit");
            System.out.println("Enter your choice: ");

            int choiceNumber = scanner.nextInt();
            switch (choiceNumber) {
                case 1:

                    Book.displayAllBook();
                    break;
                case 2:
                    Book.addBooks(scanner);
                    break;
                case 3:
                    Book.updateBooks(scanner);
                    break;

                case 4:
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
                    break;

                case 5:

                    break;

                case 6:
                    existFromApp();
                    break;

            }
        }

    }

    public static void existFromApp() {
        System.exit(0);
    }
}
