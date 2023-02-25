package org.example;

import java.io.IOException;
import java.util.Arrays;

import static java.lang.System.in;

public class Arrays5 {
    public static void main(String[] args) throws java.io.IOException {
        //TakeAVG();
        //Rewrote();
        //int array[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //System.out.println(array[-3]);
        //MinMax();
        //EncryptionDecryption();
        Bubble();
    }

    public static void EncryptionDecryption() throws IOException {
        System.out.print("Введите текст: ");
        String msg = String.valueOf(in.read());
        String encmsg = "";
        String decmsg = "";
        String key = "чтобудет";
        int j = 0;
        System.out.print("Исходное сообщение: ");
        System.out.println (msg);

        // шифрование сообщения
        for (int i = 0; i < msg.length (); i++) {
            // построение зашифрованной строки сообщения
            encmsg = encmsg + (char) (msg.charAt (i) ^ key.charAt (j));
        }
        System.out.print("Зашифрованное сообщение: ");
        System.out.println (encmsg);

        // дешифровка сообщения
        j = 0;
        for (int i = 0; i < msg.length (); i++) {
            // построение дешифрованной строки сообщения
            decmsg = decmsg + (char) (encmsg.charAt (i) ^ key.charAt (j));
            j++;
            if (j == 8){
                j = 0;
            }
        }
        System.out.print("Дешифрованное сообщение: ");
        System.out.println (decmsg);
    }

    public static void TakeAVG() {
        int array[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double avg = (double) Arrays.stream(array).sum() / 10;
        System.out.println(avg);
    }

    public static void MinMax() {
        int nums [] = new int [10];
        int min, max ;
        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287 ;
        nums[9] = 49;
        min = max = nums [0] ;
        for (int x : nums) {
            if (x < min) min = x;
            if (x > max) max = x;
        }
        System.out.println( "min и max : " + min + " " + max);
    }

    public static void Rewrote() {
        int x = -1;
        int y = 0;
        y = x < 0 ? 10 : 0;
    }

    public static void Bubble() {
        String array[] = new String[]{"ghbdehwqrbk23 c3fwfew", " fwe", "fcwecfwe", ""};

        int a, b;
        String t;
        int size = array.length;

        System.out.println("first arr:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }

        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if(array[b-1].length() > array[b].length()) {
                    t = array[b - 1];
                    array[b-1] = array[b];
                    array[b] = t;
                }
            }
        }
        System.out.println();

        System.out.println("second arr:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
