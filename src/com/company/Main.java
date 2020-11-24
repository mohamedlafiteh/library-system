package com.company;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        LibraryUsers member1 = new  LibraryUsers();
        LibraryUsers member2 = new  LibraryUsers();

        EDevices eDevices1 =new EDevices("computer1","upstairs",true);
        EDevices eDevices2 =new EDevices("computer2","downstairs",false);
        EDevices eDevices3 =new EDevices("computer3","downstairs",false);



        PBook pbook1 = new PBook();
        PBook pbook2 = new PBook();
        PBook pbook3 = new PBook();
        PBook pbook4 = new PBook();
        PBook pbook5 = new PBook();
        PBook pbook6 = new PBook();
        PBook pbook7 = new PBook();


        Book ebook1 = new EBook();
        Book ebook2 = new EBook();
        Book ebook3 = new EBook();

        library.addResource(pbook1);
        library.addResource(pbook2);
        library.addResource(pbook3);
        library.addResource(pbook4);
        library.addResource(pbook5);
        library.addResource(pbook6);
        library.addResource(pbook7);


        library.addResource(ebook1);
        library.addResource(ebook2);

        library.addDevices(eDevices1);
        library.addDevices(eDevices2);

        //System.out.println(pbook1.getMember());
        //System.out.println(pbook1.getIsBorrowed());

        library.lendBook(member1,pbook1);
        library.lendBook(member1,pbook2);
        System.out.println(pbook1.getMember());
        System.out.println(pbook1.getIsBorrowed());
        System.out.println(pbook2.getMember());
        System.out.println(pbook2.getIsBorrowed());
        int s = member1.numberOfBorrowedBooks();
        System.out.println(s);


//        library.lendBook(member1,pbook3);
//        library.lendBook(member1,pbook4);
//        library.lendBook(member1,pbook5);
//        library.lendBook(member1,pbook6);
//        library.lendBook(member1,pbook7);
        library.returnBook(pbook1,false,"");
        System.out.println(pbook1.getMember());
        System.out.println(pbook1.getIsBorrowed());

        int n = member1.numberOfBorrowedBooks();
        System.out.println(n);





    }
}
