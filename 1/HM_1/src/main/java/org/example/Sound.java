package org.example;

public class Sound {
    public static void main(String[] args) {
        {
            double dist;
            dist = 1100 * 7.2/2;
            System.out.println(dist);
            System.out.println("A\tB\tC");
            System.out.println("D\tE\tF");

            StringInRow();
            SimpleNumbers();
        }
    }

    public static void StringInRow() {
        System.out.println("one\ntwo\nfree");
    }

    public static void SimpleNumbers() {
        int counter = 0;
        for (double i = 2; i <= 100; i++) {
            for (double j = 1; j < 10; j++) {
                if ((i % j == 0) && i/i == 1) {
                    counter++;
                }
            }
            if (counter == 2){
                System.out.println((int)i);
            }
            counter = 0;
        }
    end:
        for (;;){
           one: {
               two: {
                    {
                        if ( counter==1) break one;
                        if ( counter==2 ) break two;
                        if ( counter==2 ) break end;
                    }
                }
            }
        }
    }

}
