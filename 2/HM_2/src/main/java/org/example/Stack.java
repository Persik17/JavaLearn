package org.example;

public class Stack {
    private char[] array;
    private int top;

    public Stack(int size) {
        array = new char[size];
        top = -1;
    }

    public char push(char ch) {
        if (top == array.length) {
            System.out.println("- queue is full");
            return (char) 0;
        }

        return array[++top] = ch;
    }

    char pop(char el) {
        if (top ==  -1) {
            System.out.println("- queue is empty");
            return (char) 0;
        }

        return array[top--];
    }

    public char readTop() {
        return array[top];
    }

    void get() {
        if (array.length == 0) {
            System.out.println("array is empty");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }
}
