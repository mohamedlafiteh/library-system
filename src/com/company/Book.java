package com.company;

public class Book
{
    // instance variables - replace the example below with your own
    private int ISBN;
    private String bookTitle;
    private String author;
    private int year;
    private String publisher;
    private String bookType;
    // change to use
    Library resources;

    /**
     * Constructor for objects of class Book
     */
    public Book(int ISBN,String bookTitle,String author,int year,String publisher,String bookType) {

        // initialise instance variables
        this.ISBN=ISBN;
        this.bookTitle=bookTitle;
        this.author=author;
        this.year=year;
        this.publisher=publisher;
        this.bookType=bookType;

        // resources=new Library();



    }


    public int getISBN() {
        return ISBN;
    }


    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }


    public String getBookTitle(){

        return this.bookTitle;
    }
    public void setBookTitle(String bookTitle){

        this.bookTitle=bookTitle;
    }
    public String getAuthor(){

        return  this.author;
    }
    public void setAuthor(String author){

        this.author=author;
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

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void printDetailsOfBook(){

        String  details="";
        details+= "The ISBN is " +  ISBN+ "\n";
        details+= "The bookTitle is " + bookTitle+ "\n";
        details+= "The author is " + author+ "\n";
        details+= "The year is " + year+ "\n";
        details+= "The publisher is " + publisher+ "\n";
        details+= "The bookType is " + bookType+ "\n";
        System.out.println(details);


    }
         /*public boolean CheckBookAvailability(Book book){

       if(resources.contains(book)){
           return true;
        }
        return false;
    }*/

}
