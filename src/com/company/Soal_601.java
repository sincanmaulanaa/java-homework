package com.company;
import java.io.*;
import java.util.Scanner;

public class Soal_601 {
	public static void main(String[] args) {
		String fileName = "C:\\Users\\vince\\IdeaProjects\\Pertemuan11\\src\\com\\company\\mhs.txt";

		try {
			// membaca file
			File myFile = new File(fileName);
			Scanner fileReader = new Scanner(myFile);

			System.out.println("1234567890123456789023456789");
			// cetak isi file
			while (fileReader.hasNextLine()) {
				String data = fileReader.nextLine();
				System.out.println(data);
			}
		} catch (FileNotFoundException ex) {
			System.out.println("Terjadi kesalahan: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
