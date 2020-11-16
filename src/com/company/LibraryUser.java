package com.company;

import java.util.ArrayList;

public class LibraryUser {
    private  String firstName;
    private  String lastName;
    private  String id;
    private  String notifications;
  ArrayList<Book> borrowedBooks;

    public LibraryUser(String firstName,String lastName,String id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;
        this.notifications="";
        borrowedBooks=new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNotifications() {
        return notifications;
    }

    public void setNotifications(String notifications) {
        this.notifications += notifications;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }
    public void returnBook(Book book){
        borrowedBooks.remove(book);
    }
    public void printUserDetails(){
        String details="";
        details+="The first name is " + firstName + "\n";
        details+="The last name is " + lastName + "\n";
        details+="The Id is " + id + "\n";
        System.out.println(details);
    }
    public void printUserMessages(){
        System.out.println(notifications);
    }
    public void addBook(Book book){
        borrowedBooks.add(book);
    }

    public String printAllBooksInList(){
        String bookDetails="";
        if(borrowedBooks.size()>0){

            for (Book book:borrowedBooks){
                bookDetails+="ISBN " + book.getISBN()+"\n";
                bookDetails+="bookTitle " +book.getBookTitle()+"\n";
                bookDetails+="author " + book.getAuthor()+"\n";
                bookDetails+="year " + book.getYear()+"\n";
                bookDetails+="publisher " + book.getPublisher()+"\n";

            }
        }else {
            bookDetails+="Sorry the list is empty ";
        }
        return bookDetails;
    }
    public int numberOfBorrowedBooks(){
        return borrowedBooks.size();
    }

}
