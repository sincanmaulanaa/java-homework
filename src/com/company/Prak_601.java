package com.company;
import java.io.*;
import java.util.Scanner;

// Program untuk membaca file teks
public class Prak_601 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\vince\\IdeaProjects\\Pertemuan11\\src\\com\\company\\hasil.txt";

        try {
            // membaca file
            File myFile = new File(fileName);
            Scanner fileReader = new Scanner(myFile);

            // cetak isi file
            while(fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Terjadi kesalahan: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
