package com.company;

public class Book {
    private String ISBN;
    private String damages;
    //Library person;
    //Library list/collection;
    public Book(String ISBN) {
        this.ISBN=ISBN;
        this.damages="";
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
//    public  boolean bookAvailabilityCheck(String bookName){
//       if(Library collection){
//           return true
//        }
//       return false
//    }
//    public String bookDetails(String book){
//        if(Library collection == null){
//            System.out.println("it is not availbale");
//        } else {
//            System.out.println("book details");
//        }
   // }
}
