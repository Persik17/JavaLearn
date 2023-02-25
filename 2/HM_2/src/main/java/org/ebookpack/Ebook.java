package org.ebookpack;

import org.bookpack.Book;
import org.interfaces.IShowInfo;

import java.util.Date;

public class Ebook extends Book implements IShowInfo {
    public Ebook(String a, String t, Date pd) {
        super(a, t, pd);
    }

    public void show() {
        System.out.println("Book:");
        System.out.println("Author: " + getAuthor());
        System.out.println("Title: " + getTitle());
        System.out.println("Public date: " + getPubDate());
    }
}
