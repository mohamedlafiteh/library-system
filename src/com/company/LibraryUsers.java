package com.company;

import java.util.ArrayList;

/**
 * Write a description of class LibraryUsers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LibraryUsers
{
    // instance variables - replace the example below with your own
    private  String firstName;
    private  String lastName;
    private  String id;
    private  String notifications;
    ArrayList<Book> borrowedBooks;

    /**
     * Constructor for objects of class LibraryUsers
     */
    public LibraryUsers(){
        this.firstName="";
        this.lastName="";
        this.id="";
        this.notifications="";
        borrowedBooks=new ArrayList<>();
    }
    public LibraryUsers(String firstName,String lastName,String id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;
        this.notifications="";
        borrowedBooks=new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
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
        this.notifications += ", " + notifications;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void borrowBook(Book book){
        this.borrowedBooks.add(book);
    }
    public void returnBook(Book book){
        borrowedBooks.remove(book);
    }
    public void printUserDetails(){
        String details="";
        details+="The Id is " + id + "\n";
        details+="The first name is " + firstName + "\n";
        details+="The last name is " + lastName + "\n";

        System.out.println(details);
    }
    public void printUserMessages(){
        System.out.println(notifications);
    }

    public String printTheListOfBorrowedBooks(){
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
            bookDetails+="The list is empty ";
        }
        return bookDetails;
    }
    public int numberOfBorrowedBooks(){
        return borrowedBooks.size();
    }

    public ArrayList<Book> borrowedBooksList(){
        return borrowedBooks;
    }

}
