package com.company;

import java.util.ArrayList;

public class ElectronicResourceBooks {

    ArrayList<LibraryElectronicDevices> devices ;

    public ElectronicResourceBooks(int ISBN,String bookTitle,String author,int year,String publisher){
       // super(ISBN,bookTitle,author,year,publisher);
       devices=new ArrayList<>();
    }
}
