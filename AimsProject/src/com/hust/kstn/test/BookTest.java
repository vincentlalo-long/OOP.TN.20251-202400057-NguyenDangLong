package com.hust.kstn.test;
import com.hust.kstn.models.*;

public class BookTest {
    public static void main(String[] args) {
        
        BookAuthor fujiko = new BookAuthor("Fujiko F. Fujio", 1933, "Japanese manga creator, known for Doraemon.");
        BookAuthor aoyama = new BookAuthor("Gosho Aoyama", 1963, "Japanese manga artist, creator of Detective Conan.");
        BookAuthor takahashi = new BookAuthor("Kazuki Takahashi", 1961, "Japanese manga artist, creator of Yu-Gi-Oh!.");
        BookAuthor murakami = new BookAuthor("Haruki Murakami", 1949, "Japanese writer, known for surrealist works.");
        BookAuthor one = new BookAuthor("Eiichiro Oda", 1975, "Japanese manga artist, creator of One Piece.");
        BookAuthor namcao = new BookAuthor("Nam Cao", 1917, "Vietnamese critical realist short story writer.");

        
        BookAuthor[] singleAuthor = {fujiko};
        Book book1 = new Book("Doraemon: Nobita's Adventure", "Manga/Adventure", 15.5, 50000, singleAuthor);
        
        System.out.println("\n=== TEST CASE 1: Single Author Book ===");
        System.out.println("Book ID: " + book1.getId());
        System.out.println("Total Books Created: " + book1.getNumBook()); 
        System.out.println("Book Details:");
        System.out.println(book1.toString()); 
        
        BookAuthor[] multipleAuthors = {aoyama, takahashi, murakami};
        Book book2 = new Book("Global Manga Collaboration", "Fiction/Science", 30.99, 120000, multipleAuthors);
        
        System.out.println("\n=== TEST CASE 2: Multiple Authors Book ===");
        System.out.println("Book ID: " + book2.getId());
        System.out.println("Total Books Created: " + book2.getNumBook()); 
        System.out.println("Book Details :");
        System.out.println(book2.toString()); 
        
        BookAuthor[] noAuthor = {};
        Book book3 = new Book("The Unnamed History", "History", 5.0, 30000, noAuthor);
        
        System.out.println("\n=== TEST CASE 3: No Author Book ===");
        System.out.println("Book ID: " + book3.getId());
        System.out.println("Total Books Created: " + book3.getNumBook()); 
        System.out.println("Book Details:");
        System.out.println(book3.toString()); 
    }
}