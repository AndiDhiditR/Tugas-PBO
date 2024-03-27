package Evaluasi;

/**
 *
 * 1302020220151,Andi Dhidit Riyandy,Rabu 27 MAR 2024
 */

import Evaluasi.Mahasiswa.Identitas;
import Evaluasi.Mahasiswa.Nilai;
import Evaluasi.HitungNilai.HitungNilaiAkhir;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Utama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Identitas identitas = new Identitas();
        Nilai nilai = new Nilai();

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        identitas.setNama(nama);

        System.out.print("Masukkan stambuk: ");
        String stambuk = scanner.nextLine();
        identitas.setStambuk(stambuk);

        System.out.print("Masukkan nilai tugas1: ");
        int tugas1 = scanner.nextInt();
        nilai.setTugas1(tugas1);

        System.out.print("Masukkan nilai tugas2: ");
        int tugas2 = scanner.nextInt();
        nilai.setTugas2(tugas2);

        System.out.print("Masukkan nilai mid: ");
        int mid = scanner.nextInt();
        nilai.setMid(mid);

        System.out.print("Masukkan nilai uas: ");
        int uas = scanner.nextInt();
        nilai.setUas(uas);

      
        double tugas = HitungNilaiAkhir.nilaiTugas(tugas1, tugas2);
        double na = HitungNilaiAkhir.nilaiAkhir(tugas, mid, uas);

        JOptionPane.showMessageDialog(null, "Nama: " + identitas.getNama() + "\nStambuk: " + identitas.getStambuk());
        JOptionPane.showMessageDialog(null, "Nilai Tugas: " + tugas + "\nNilai Mid: " + mid + "\nNilai UAS: " + uas + "\nNilai Akhir: " + na);
    }
}

