package Tugas;

/**
 *
 * 1302020220151,Andi Dhidit Riyandy,Rabu 27 MAR 2024
 */

import java.util.Scanner;

public class TestNilai {
    public static void main(String[] args) {
        HitungRata hitung = new HitungRata();
        Scanner input = new Scanner(System.in);
        
        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Input Nilai");
            System.out.println("2. Input Nilai Baru");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Jumlah Data: ");
                    int banyakData = input.nextInt();
                    int nilai[] = new int[banyakData];
                    System.out.println("Masukkan Nilai:");
                    hitung.inputNilai(nilai);
                    System.out.print("Daftar Nilai: ");
                    hitung.cetakNilai(nilai);
                    System.out.println("Rata Nilai: " + hitung.rataNilai(banyakData));
                    break;
                    
                case 2:
                    System.out.print("Masukkan Nilai Baru: ");
                    int nilaiBaru = input.nextInt();
                    hitung.inputNilaiBaru(nilaiBaru);
                    System.out.print("Daftar Nilai Baru: ");
                    hitung.cetakNilaiBaru();
                    break;
                    
                case 3:
                    System.out.println("Keluar dari Program.");
                    break;
                    
                default:
                    System.out.println("Menu tidak valid. Silakan pilih lagi.");
                    break;
            }
        } while (pilihan != 3);
        
        input.close();
    }
}

