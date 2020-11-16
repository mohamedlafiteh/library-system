package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Library library = new Library();
        LibraryElectronicDevices libraryDevice=new LibraryElectronicDevices();
        Book book1=new Book(10,"JAVA","BlueJ",2020,"SeaCode");
        Book book2=new Book(20,"python","red",1920,"Code");

        LibraryUser member1=new LibraryUser("Mohamed","Ali","2256");
//        library.addBook(book1);
//        library.addBook(book2);
         member1.borrowBook(book1);
         member1.borrowBook(book2);
        System.out.println(member1.borrowedBooks.size());
        System.out.println(member1.printAllBooksInList());






//        LibraryElectronicDevices laptop=new LibraryElectronicDevices("computer","floor1",true);
//        LibraryElectronicDevices ipad=new LibraryElectronicDevices("tablet"," floor2",true);
//        LibraryElectronicDevices phone=new LibraryElectronicDevices("tablet"," floor2",true);
//
//
//        libraryDevice.addDevices(laptop);
//        libraryDevice.addDevices(ipad);
//        System.out.println(libraryDevice.devicesInLibrary.size());
//        System.out.println(libraryDevice.printDeviceDetails(ipad));
//
//        System.out.println(libraryDevice.checkAvailability(phone));
//        System.out.println(libraryDevice.printDeviceDetails(phone));
//        //System.out.println(libraryDevice.getDeviceAvailability());
//        System.out.println(phone.getDeviceAvailability());



        // Book boo4 =new Book( 2354,"LOST PAGE 8","java","pop",false,1988,"JM books");

        //library.addBook(boo4);

        //System.out.println(library.checkResource(boo));
        //System.out.println(library.libraryDetails());


    }
}
