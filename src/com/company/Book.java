package com.company;

public class Book {
    private int ISBN;
    private String bookTitle;
    private String author;
    private int year;
    private String publisher;
    private String bookType;
    LibraryUser person;
    Library resources;

    public Book(int ISBN,String bookTitle,String author,int year,String publisher,String bookType) {
        this.ISBN=ISBN;
        this.bookTitle=bookTitle;
        this.author=author;
        this.year=year;
        this.publisher=publisher;
        this.bookType=bookType;

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
    //public boolean bookAvailabilityCheck(Book book){
//        for(int i = 0; i < resources.size();i++){
/*          Book bookCheck = resources.get(book);
             if(bookCheck){
                  return true;
              }else {
              return false;
              }
    }
    }*/

//    public String bookDetails(String book){
//        if(Library resources == null){
//            System.out.println("it is not available");
//        } else {
//            System.out.println("book details");
//        }
   // }
}
