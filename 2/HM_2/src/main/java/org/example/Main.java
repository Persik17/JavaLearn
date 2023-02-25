package org.example;

import org.bookpack.Book;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Book books[] = new Book[3];
        books[0] = new Book("Alex", "LALAlend", new Date());
        //VehClass();
        //ArrayClass();
        //vaTest(10);
        //vaTest(10, 11, 1);
        //vaTest();

        //Test t1 = new Test(12);
        //Test t2 = new Test(30);
        //Test.swap(t1, t2);

        //sum(1, 2, 3, 4, 5, 6);
        //System.out.println(reverse("MyString"));
        //getStack();
        animalClass();
    }

    static void animalClass() {
        Tiger t1 = new Tiger("Tot", 12, false);
        Tiger t2 = new Tiger("Tot", 12, false);
        t1.roar();
        t1.showAnimal();
        t1.tigerTold();
        System.out.println(t1.equals(t2));
    }

    public static void getStack() {
        Stack st = new Stack(5);
        char[] chars = new char[]{'A', 'B', 'C', 'D', 'E'};
        char ch;
        int i;
        st.get();

        for (i = 0; i < chars.length; i++)
            st.push(chars[i]);
        st.get();
        st.pop(st.readTop());
        st.get();
    }

    public static String reverse(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    static void sum(int... v) {
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }
        System.out.println(sum);
    }

    static void vaTest(int... v) {
        System.out.println("Count:" + v.length);
        System.out.println("Values:");

        for (int i = 0; i < v.length; i++) {
            System.out.println("arg " + i + ": " + v[i]);
        }

        System.out.println();
    }

    static void VehClass() {
        //Vehicle vh = new Vehicle(16,10,200);
        Vehicle x = new Vehicle();
        Vehicle y = new Plane();

        Plane x1 = new Plane();
        Plane x2 = new Plane(x1);

        Vehicle vh = new Vehicle(16, 10, 200, 11);
        Plane pl = new Plane(16, 10, 80, 2, 4);
        pl.getAllPeopleFromPlane();
        System.out.println(String.format("mpg = %d\nfuelcap = %d\npassangers = %d ", vh.getMpg(), vh.getfuelcap(), vh.getPassangers()));
        vh.getRange();
        pl.getRange();
        System.out.println(vh.getRange(vh.getfuelcap(), vh.getMpg()));
        vh.getMiltiplieMpg(12);
        vh.trip(vh);
        System.out.println(String.format("mpg = %d\nfuelcap = %d\npassangers = %d ", vh.getMpg(), vh.getfuelcap(), vh.getPassangers()));

    }

    static void ArrayClass() {
        FailSortArray fs = new FailSortArray(5, -1);
        int x;

        System.out.println("1.");
        for (int i = 0; i < (fs.length * 2); i++)
            fs.put(i, i * 10);

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
        }
        System.out.println("");

        System.out.println("\n2.");
        for (int i = 0; i < (fs.length * 2); i++) {
            if (!fs.put(i, i * 10)) System.out.println("index " + i + " error");
        }
        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
            else System.out.println("index " + i + " error");
        }
    }
}