//1302020220151,Andi Dhidit Riyandy,Minggu 25 FEB 2024
import java.util.Scanner;

public class T4{
    public static void main(String[] args) {
        // Kamus
        int a;
        Scanner masukan;

        // Program
        System.out.print("Contoh membaca dan menulis, ketik nilai integer: \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt(); // Membaca input dari pengguna

        System.out.print("Nilai yang dibaca : " + a);
        
        // Menutup scanner setelah digunakan
        masukan.close();
    }
}
