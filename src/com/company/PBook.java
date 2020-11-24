package com.company;

/**
 * Write a description of class PBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PBook extends Book
{
    // instance variables - replace the example below with your own
    private String damages;
    private boolean borrowed;
    private LibraryUsers member;

    /**
     * Constructor for objects of class PBook
     */
    public PBook(){
        // initialise instance variables
        super(22,"java","author", 1990, "publisher", "physical");
        this.damages="";
        this.borrowed=false;
        this.member=null;
    }

    public PBook(int ISBN,String bookTitle,String author,int year,String publisher,String bookType,String damages,boolean borrowed){
        // initialise instance variables
        super(ISBN,bookTitle,author, year, publisher, bookType);
        this.damages=damages;
        this.borrowed=borrowed;
        this.member=null;
    }



    public void setMemberToNull (){
        this.member=null;
    }


    public void updateMember (LibraryUsers newMember){
        this.member=newMember;
    }

    public boolean checkBookAvailability(){

        if(this.member == null){
            return true;
        }
        return false;
    }

    public String getDamages() {
        return damages;
    }

    public void setDamages(String damages) {
        this.damages += ", "+ damages;
    }

    public boolean getIsBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public LibraryUsers getMember() {

        return member;
    }

}
