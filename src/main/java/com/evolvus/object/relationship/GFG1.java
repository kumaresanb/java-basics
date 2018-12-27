package com.evolvus.object.relationship;

import java.util.ArrayList;
import java.util.List;

public class GFG1 {
	
	public static void main(String[] args) {
		  // Creating the Objects of Book class. 
        Book b1 = new Book("EffectiveJ Java", "Joshua Bloch"); 
        Book b2 = new Book("Thinking in Java", "Bruce Eckel"); 
        Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt"); 
        
        List<Book> books=new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        
        Library library =new Library(books);
        
        List<Book> lib=library.getTotalBooksInLibrary();
        
        lib.forEach(libs->{
        	System.out.println("Title : " + libs.title + " and " 
                    +" Author : " + libs.author); 
        });
	}

}
