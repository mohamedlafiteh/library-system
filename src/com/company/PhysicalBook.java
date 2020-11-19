package com.company;

public class PhysicalBook extends Book{
    private String damages;
    private boolean borrowed;

    public PhysicalBook(int ISBN,String bookTitle,String author,int year,String publisher,String damages,boolean borrowed,String bookType){
        super(ISBN,bookTitle,author,year,publisher,bookType);
       this.damages=damages;
       this.borrowed=borrowed;

    }

    public String getDamages() {
        return damages;
    }

    public void setDamages(String damages) {
        this.damages = damages;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
}
