/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.managment.system;

/**
 *
 * @author ST10345884 TIEGO MFULOANE 
 */
class LibraryReport {
    public static void generateReport(Library library) {
        System.out.println("Library Report:");
        library.listBooks();
    }
}