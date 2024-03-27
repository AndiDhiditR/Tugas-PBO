package Tugas;

/**
 *
 * 1302020220151,Andi Dhidit Riyandy,Rabu 27 MAR 2024
 */

import java.util.Scanner;

import java.util.*;
public class HitungRata {
    private double total = 0.0;
    private ArrayList nilaiBaru = new ArrayList();
    Scanner input = new Scanner(System.in);
    public void inputNilai(int nilai[]) {
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = input.nextInt();
            total += nilai[i];
        }
    }
    public double rataNilai(int Ndata) {
        return total / ((double) Ndata);
    }
    public void cetakNilai(int nilai[]) {
        for (int angka : nilai) {
            System.out.print(angka + "\n");
        }
        System.out.println();
    }
    public void inputNilaiBaru(int jumlah) {
        while (jumlah > 0) {
            nilaiBaru.add(input.nextInt());
            jumlah--;
        }
    }
    public void cetakNilaiBaru() {
        ListIterator i = nilaiBaru.listIterator(0);
        while (i.hasNext()) {
            Object data = i.next();
            if (data == null) {
                System.out.println("null");
            } else {
                System.out.println(data.toString());
            }
        }
    }
}