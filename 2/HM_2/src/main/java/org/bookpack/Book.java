package org.bookpack;

import org.interfaces.IShowInfo;

import java.util.Date;

public class Book extends Object implements IShowInfo {
    protected String author;
    protected String title;
    protected Date pubDate;

    //get
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Date getPubDate() {
        return pubDate;
    }

    //set
    void setAuthor(String a) {
        author = a;
    }

    void setTitle(String t) {
        title = t;
    }

    void setVegan(Date pb) {
        pubDate = pb;
    }

    public Book(String a, String t, Date pd) {
        author = a;
        title = t;
        pubDate = pd;
    }

    public void show() {
        System.out.println("Book:");
        System.out.println("Author: " + getAuthor());
        System.out.println("Title: " + getTitle());
        System.out.println("Public date: " + getPubDate());
    }

    public String getAuthorAndTitle() {
        return IShowInfo.super.getAuthorAndTitle();
    }
}
