package org.example;

public class Test {
    int a;

    Test(int i) {
        a = i;
    }

    public static void swap(Test t1, Test t2) {
        System.out.println(String.format("t1 - %d, t2 - %d", t1.a, t2.a));

        int a = t1.a;

        t1.a = t2.a;
        t2.a = a;

        System.out.println(String.format("t1 - %d, t2 - %d", t1.a, t2.a));
    }

}
