package com.company;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> resources;

    public Library() {
        resources = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.resources.add(book);
    }

    // Error here the method prints 000 before the string

    public String libraryDetails() {
        System.out.println(" We have " + resources.size() + " books in the library");
        String bookInf = "";

        for (int i = 0; i < resources.size(); i++) {
            // bookInf += "book title " + resources.get(i).bookTitle;
            if (resources.size() > 0) {
                 bookInf+= resources.get(i).getBookTitle();
                bookInf+= resources.get(i).getDamages();
                bookInf+= resources.get(i).getISBN();

            } else {
                 bookInf += "the library is empty ";
            }
        }
        return bookInf;
    }

    public  boolean checkResource(Book book){
        boolean bookCheck = resources.contains(book);
        if(bookCheck){
                 return true;
             } else {
                 return false;
             }
    }
    public void editBookTitle(Book book, String newTitle){
        
    }
}
