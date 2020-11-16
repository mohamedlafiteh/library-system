package com.company;

import java.util.ArrayList;

public class LibraryUser {
    String firstName;
    String lastName;
    String notifications;
    ArrayList<Book> borrowedBooks;
    public LibraryUser(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.notifications="";
        borrowedBooks=new ArrayList<>();
    }
}
