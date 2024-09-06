/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library.managment.system;

import java.util.Scanner;

/**
 *
 * @author ST10345884 TIEGO MFULOANE 
 */
public class LibraryManagmentSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(100); 

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. List Books");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    String isbn = scanner.nextLine();
                    Book book = new Book(title, author, isbn);
                    library.addBook(book);
                    break;

                case 2:
                    System.out.print("Enter ISBN of the book to remove: ");
                    String removeIsbn = scanner.nextLine();
                    library.removeBook(removeIsbn);
                    break;

                case 3:
                    library.listBooks();
                    break;

                case 4:
                    LibraryReport.generateReport(library);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
