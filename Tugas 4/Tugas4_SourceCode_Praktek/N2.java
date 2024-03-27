/**
 *
 * 1302020220151,Andi Dhidit Riyandy,Rabu 27 MAR 2024
 */
import java.util.*;

class Orang {
    public String nama;

    public Orang() {
        this.nama = "Nur Ikhwan Alfiansyah";
    }

    public Orang(String nama) {
        this.nama = nama;
    }

    public static void info() {
        System.out.println("Ini adalah info dari class Orang.");
    }
}

class Mahasiswa extends Orang {
    private String stb;

    public Mahasiswa() {
        super();
        this.stb = "1302002131"; //stambuk anda
    }

    public static void info() {
        System.out.println("Ini adalah info dari class Mahasiswa.");
    }
}

public class N2 {
    public static void main(String[] args) {
        Orang.info();
        Mahasiswa.info();
    }
}