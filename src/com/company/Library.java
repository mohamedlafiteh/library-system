package com.company;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> resources;
    ArrayList<LibraryElectronicDevices> devices;
    ArrayList<LibraryUser> users;

    public Library() {
        resources = new ArrayList<>();
        devices=new ArrayList<>();
        users =new ArrayList<>();
    }

    public void addBook(Book book) {
        this.resources.add(book);
    }

    // Error here the method prints 000 before the string

    public String libraryDetails() {
        System.out.println(" We have " + resources.size() + " books in the library");
        String bookInf = "";

        for (int i = 0; i < resources.size(); i++) {

            if (resources.size() > 0) {
                 bookInf+= resources.get(i).getBookTitle() +"\n";
               // bookInf+= resources.get(i).getDamages();
                bookInf+= resources.get(i).getISBN() +"\n";
                bookInf+= resources.get(i).getAuthor() +"\n";
                bookInf+= resources.get(i).getYear() +"\n";
                bookInf+= resources.get(i).getPublisher() +"\n" +"\n";

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
        if(resources.contains(book)){
            int index = resources.indexOf(book);
            Book bookToEdit= resources.get(index);
            bookToEdit.setBookTitle(newTitle);
        }else {
            System.out.println("The book is not in the library");
        }
    }

    public Book searchBookInResourcesByObject(Book book){
        if(resources.contains(book)){
            int index = resources.indexOf(book);
            Book bookFound= resources.get(index);
          return bookFound;
        }else {
            return null;
        }
    }

    public String searchBookInResourcesByISBN(int isbn){
        int count=0;
        String details="";
      for (Book book:resources){
          if(book.getISBN()==isbn){
             details+= book.getBookTitle() +"\n";
              details+= book.getISBN() +"\n";
              details+= book.getBookTitle() +"\n";
              details+= book.getAuthor() +"\n";
              details+= book.getYear() +"\n";
              details+= book.getPublisher() +"\n";
              count++;
          }else {
              details+="No resources with this isbn";
          }
      }
        System.out.println("The number or books with this " + isbn + " is " +count);
        return details;
    }

    public String searchBookInResourcesByAuthorName(String authorName){
        int count=0;
        String details="";
        for (Book book:resources){
            if(book.getAuthor().equals(authorName)){
                details+= book.getBookTitle() +"\n";
                details+= book.getISBN() +"\n";
                details+= book.getBookTitle() +"\n";
                details+= book.getAuthor() +"\n";
                details+= book.getYear() +"\n";
                details+= book.getPublisher() +"\n";
                count++;
            }else {
                details+="No resources with this author name";
            }
        }
        System.out.println("The number or books with this author name " + authorName + " is " +count);
        return details;
    }

    public void removeResource(Book book){
        if(resources.contains(book)){
           resources.remove(book);
        }else {
            System.out.println("Not available in the library");
        }
    }
    public void removeResourceByPosition(int position){
        Book bookFound= resources.get(position);
        if(resources.contains(bookFound)){
            resources.remove(position);
        }else {
            System.out.println("Not available in the library using position");
        }
    }
//
//    public void availableBooksDetails(){
//        if (resources.size()>0){
//            for (Book book:resources){
//                if(book){
//            }
//
//        }
//
//    }
}
