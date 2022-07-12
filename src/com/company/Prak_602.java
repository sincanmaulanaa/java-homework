package com.company;
import java.io.*;

// Program untuk menulis teks
public class Prak_602 {

    public static void main(String[] args) {
	    // inisialisasi objek dan mendefinisikan Path lokasi file
        File file = new File ("C:\\Users\\vince\\IdeaProjects\\Pertemuan11\\src\\com\\company\\hasil.txt");

        // membuat statement Try-Resource-Statement
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
             // menulis data string
            bw.write("Nama saya Sincan Maulana");

            // membuat baris baru
            bw.newLine();

            bw.write("Admin SINCAN MAULANA (PROGRAMMER");
            bw.newLine();
            bw.write("Frontend Developer");
        } catch (FileNotFoundException ex) {
            // menampilkan pesan jika file tidak ditemukan
            System.out.println("File " + file.getName() + " tidak ditemukan");
        } catch (IOException ex) {
            // menampilkan pesan jika terjadi error atau file tidak dapat dibaca
            System.out.println("File " + file.getName() + " tidak dapat dibaca");
        }
    }
}
