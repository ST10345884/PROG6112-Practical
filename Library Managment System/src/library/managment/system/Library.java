/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.managment.system;

/**
 *
 * @author ST10345884 TIEGO MFULOANE 
 */
class Library {
    
    private Book[] books;
    private int bookCount;

   
    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }


    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void removeBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                books[i] = books[bookCount - 1]; // Replace with the last book
                books[bookCount - 1] = null;
                bookCount--;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void listBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
        } else {
            for (int i = 0; i < bookCount; i++) {
                System.out.println(books[i].toString());
            }
        }
    }
}