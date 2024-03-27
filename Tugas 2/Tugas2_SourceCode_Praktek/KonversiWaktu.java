//1302020220151,Andi Dhidit Riyandy,Selasa 06 MAR 2024
import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan jumlah detik
        System.out.print("Masukkan jumlah detik: ");
        int totalDetik = input.nextInt();
        
        // Menghitung jam, menit, dan detik
        int jam = totalDetik / 3600;
        int sisaDetik = totalDetik % 3600;
        int menit = sisaDetik / 60;
        int detik = sisaDetik % 60;
        
        // Menampilkan hasil konversi waktu
        System.out.println("\nHasil konversi waktu:");
        System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
        
        input.close();
    }
}