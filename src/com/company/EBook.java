package com.company;

import java.util.ArrayList;
/**
 * Write a description of class EBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EBook extends Book
{
    // instance variables - replace the example below with your own
    ArrayList<EDevices> devices ;

    /**
     * Constructor for objects of class PBook
     */
    public EBook(){
        // initialise instance variables
        super(55,"python","author", 2020, "publisher", "electronic");
        this.devices=new ArrayList<EDevices>();
    }

    public EBook(int ISBN,String bookTitle,String author,int year,String publisher,String bookType){
        // initialise instance variables
        super(ISBN,bookTitle,author, year, publisher, bookType);
        devices=new ArrayList<EDevices>();


    }


    public void addEdivece(EDevices eDevice){
        this.devices.add(eDevice);
    }
}

