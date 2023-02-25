package org.example;

// A, скомпилируется, но не выполнится из-за условий
public class Exercise1b {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            if (x > 3) {
                System.out.println("большой икс");
            }
        }
    }
}
