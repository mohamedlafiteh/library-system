package com.company;

public class Book {
    private int ISBN;
    private String damages;
    private String bookTitle;
    private String author;
    private boolean borrowed;
    private int year;
    private String publisher;
    LibraryUser person;
    Library resources;

    public Book() {
        this.ISBN=0;
        this.damages="";
         this.bookTitle="";
         this.author="";
         this.borrowed=false;

    }
    public Book(int ISBN,String damages,String bookTitle,String author,boolean borrowed,int year,String publisher) {
        this.ISBN=ISBN;
        this.damages=damages;
        this.bookTitle=bookTitle;
        this.author=author;
        this.borrowed=borrowed;
        this.year=year;
        this.publisher=publisher;

    }
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
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
    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
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
