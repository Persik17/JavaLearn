package org.bookpack;

import org.interfaces.IShowInfo;

import java.util.Date;

public class BookMain {
    public static void main(String[] args) {
        Book books[] = new Book[3];
        books[0] = new Book("Alex", "LALAlend", new Date());
        books[1] = new Book("Bob", "Java", new Date());
        books[2] = new Book("Neobob", ".Net", new Date());
        books[0].show();
        books[1].show();
        books[2].show();

        IShowInfo.printMe("Boby");
    }
}
