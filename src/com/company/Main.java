package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Library library = new Library();
        Book boo1= new Book();
        Book boo2 = new Book();
        Book boo3= new Book();
        Book boo4 =new Book( 2354,"LOST PAGE 8","java","pop",false,1988,"JM books");

        library.addBook(boo1);
        library.addBook(boo2);
        library.addBook(boo3);
        library.addBook(boo4);

        //System.out.println(library.checkResource(boo));
        System.out.println(library.libraryDetails());


    }
}
