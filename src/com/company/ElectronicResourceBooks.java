package com.company;

import java.util.ArrayList;

public class ElectronicResourceBooks {

    ArrayList<LibraryElectronicDevices> devices ;

    public ElectronicResourceBooks(String bookTitle,String author,int year,String publisher,String bookType){
       // super(ISBN,bookTitle,author,year,publisher,bookType);
       devices=new ArrayList<>();
    }
}
