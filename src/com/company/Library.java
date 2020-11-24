package com.company;

import java.util.ArrayList;
public class Library
{
    // instance variables - replace the example below with your own
    ArrayList<Book>resources;
    ArrayList<EDevices>devices;
    ArrayList<LibraryUsers>users;

    /**
     * Constructor for objects of class Library
     */
    public Library()
    {
        // initialise instance variables
        resources = new ArrayList<Book>();
        devices=new ArrayList<EDevices>();
        users =new ArrayList<LibraryUsers>();
    }

    // Error here the method prints 000 before the string


    public  boolean checkResource(Book book){
        return this.resources.contains(book);
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
        if(resources.size()>0){
            Book bookFound= resources.get(position);
            if(resources.contains(bookFound)){
                resources.remove(position);
            }else {
                System.out.println("Not available in the library using position");
            }
        }

    }
    public void availableBooksDetails(){

        if (resources.size()>0){
            System.out.println(" We have " + resources.size() + " books in the library");
            for (Book book:resources){
                if(book.getBookType()=="physical"){
                    book.printDetailsOfBook();
                }
            }
            for (Book book:resources){
                if(book.getBookType()=="electronic"){
                    book.printDetailsOfBook();
                }
            }

        }else {
            System.out.println("No books in the library");
        }
    }

    public  int numberOfResourcesInLibrary(){
        return resources.size();
    }

    public void addResource(Book book){
        if(resources.contains(book)){
            System.out.println("The book is already available in the library");

        }else {
            resources.add(book);
        }
    }

    public void addDevices(EDevices device){
        devices.add(device);
    }

    public void removeDevice(EDevices device){
        devices.remove(device);
    }
    public boolean checkAvailability(EDevices deviceIn){

        if(devices.contains(deviceIn)){
            return true;
        }
        return  false;
    }

    public String printDeviceDetails(EDevices device){
        String details ="";
        if(devices.size()==0){
            details+="No devices in the library";
        }

        for(EDevices dev: devices){
            if(dev==device){
                details+= "The Device name is " + dev.getDeviceName() + "\n";
                details+= "The Device location is " + dev.getDeviceLocation() + "\n";
                details+= "The Device availability " + dev.getDeviceAvailability() + "\n";
            }else {
                details+="Sorry the device is not available";
            }

        }
        return  details;
    }


    public void lendBook(LibraryUsers libraryUser,Book book){

        if(!resources.contains(book)){
            System.out.println("The book is not available");
        }
        if(book.getBookType()!="physical"){
            System.out.println("It is not physical book");
        }
        if(((PBook)book).getMember() != null){
            System.out.println("Another member borrowed the book");
        }
        if(libraryUser.numberOfBorrowedBooks() > 4){
            System.out.println("You reached the limit of borrowing books more than 5 books");
        } else {
            ((PBook)book).updateMember(libraryUser);
            libraryUser.borrowBook(book);
            ((PBook) book).setBorrowed(true);
        }
    }

    public void returnBook(Book book, boolean damage, String damageDescription){

        LibraryUsers user = ((PBook)book).getMember();
        user.returnBook( book);
        ((PBook)book).setMemberToNull();
        ((PBook) book).setBorrowed(false);
        if(damage){
            ((PBook)book).setDamages(damageDescription);
        }

    }

}

