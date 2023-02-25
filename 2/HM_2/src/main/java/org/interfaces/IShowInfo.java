package org.interfaces;

public interface IShowInfo {

    default String getAuthorAndTitle() {
     return "Author and Title";
    }
    void show();

    static void printMe(String st) {
        System.out.println("Hi" + st);
    }
}
