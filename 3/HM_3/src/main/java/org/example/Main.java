package org.example;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //CatchTest();
        //ReadBytes();
        //ReadByteFile();
        //ReadBufferedFile();
        SpaceToDash();
    }

    static void SpaceToDash() throws IOException {
        Path ph = Paths.get("test.txt");
        Charset charset = StandardCharsets.UTF_8;
        System.out.println(ph.toAbsolutePath());

        try (FileInputStream fin = new FileInputStream(ph.toAbsolutePath().toString())) {

            System.out.printf("File size: %d bytes \n", fin.available());

            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }

            System.out.println();

            String content = Files.readString(ph.toAbsolutePath(), charset);
            content = content.replaceAll(" ", "-");
            Files.writeString(ph.toAbsolutePath(), content, charset);

            System.out.println();

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    static void ReadByteFile() throws IOException {
        String append = "This text appended by java";
        Path ph = Paths.get("test.txt");
        System.out.println(ph.toAbsolutePath());

        try (FileInputStream fin = new FileInputStream(ph.toAbsolutePath().toString())) {

            System.out.printf("File size: %d bytes \n", fin.available());

            int i = -1;
            while ((i = fin.read()) != -1) {

                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    static void ReadBufferedFile() throws IOException {
        String text = "Hello world!"; // строка для записи

        String append = "This text appended by java";
        Path ph = Paths.get("test.txt");
        System.out.println(ph.toAbsolutePath());

        try (FileOutputStream out = new FileOutputStream(ph.toAbsolutePath().toString());
             BufferedOutputStream bos = new BufferedOutputStream(out)) {
            byte[] buffer = text.getBytes();
            bos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void ReadBytes() throws IOException {
        byte data[] = new byte[10];

        System.out.println("Enter symbols:");
        System.in.read(data);
        System.out.print("Your symbols:");

        for (int i = 0; i < data.length; i++) {
            System.out.print((char) data[i]);
        }
    }

    static void CatchTest() {

        int[] arr = new int[4];

        try {
            System.out.println("1 before exception");

            arr[6] = 10; //error
            //arr[3] = 10; //no error
            System.out.println("1 print this");
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println(e1);
        } catch (ArithmeticException e2) {
            System.out.println(e2);
        } catch (Throwable e3) {
            System.out.println(e3);
        } finally {
            System.out.println("1 break");
        }

        System.out.println("1 after exception");
    }
}


