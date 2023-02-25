package org.example;

import java.io.IOException;

import static java.lang.System.*;

public class Cycle3 {
    public static void main(String[] args) throws java.io.IOException {
        //WhileNotDot();
        //ThousandToZero();
        //GeometricUpper();
        //UpperToLowerAndRevers();
    }

    public static void UpperToLowerAndRevers() throws IOException {
        char ch;
        int counter = 0;

        for (;;) {
            ch = (char) in.read();
            if (ch >= 65 && ch <= 90)
            {
                ch = (char) (ch + 32);
            } else if (ch >= 97 && ch <= 122) {
                ch = (char) (ch - 32);
            }
            counter++;
            if (ch == '.') {
                out.println(counter);
                break;
            }
            out.println(ch);
        }
    }

    public static void GeometricUpper() {
        int x = 1;
        for (int i = 1;i < 12; i++) {
            x = x * 2;
            out.println(x);
        }
    }

    public static void WhileNotDot() throws IOException {
        char ch;
        int counter = 0;

        for (;;) {
            ch = (char) in.read();
            if (ch == ' ') counter++;
            if (ch == '.') {
                out.println(counter);
                break;
            }
        }
    }

    public static void ThousandToZero() {
        for (int i = 1000;;i = i - 2){
            out.println(i);
            if (i == 0) break;
        }
    }

}
