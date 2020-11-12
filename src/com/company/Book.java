package com.company;

public class Book {
    private String ISBN;
    private String damages;
    private String bookTitle;
    private String author;
    private boolean borrowed;
//    public int year;
//    public String publisher;
    LibraryUser person;
    Library resources;
    public Book(String ISBN) {
        this.ISBN=ISBN;
        this.damages="";
         this.bookTitle="";
         this.author="";
         this.borrowed=false;

    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getDamages() {
        return damages;
    }

    public void setDamages(String damages) {
        this.damages = this.damages + ", " + damages;
    }
    public String getBookName(){
        return this.bookTitle;
    }
    public void setBookName(String bookTitle){
        this.bookTitle=bookTitle;
    }
    public String getAuthor(){
        return  this.author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public boolean getBorrowed(){
        return  this.borrowed;
    }
    public void  setBorrowed(boolean borrowed){
        this.borrowed=borrowed;
    }
    //public boolean bookAvailabilityCheck(Book book){
//        for(b:resources){
//            System.out.println(b);
//        }
//       if(Library ){
//           return true
//        }
//       return false
    //}
//    public String bookDetails(String book){
//        if(Library resources == null){
//            System.out.println("it is not available");
//        } else {
//            System.out.println("book details");
//        }
   // }
}
