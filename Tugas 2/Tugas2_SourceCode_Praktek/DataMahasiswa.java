//1302020220151,Andi Dhidit Riyandy,Selasa 06 MAR 2024
import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan NIM Anda: ");
        String nim = scanner.nextLine();
        
        System.out.print("Masukkan Nama Anda: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Jurusan Anda: ");
        String jurusan = scanner.nextLine();
        
        System.out.print("Masukkan Fakultas Anda: ");
        String fakultas = scanner.nextLine();
        
        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Fakultas: " + fakultas);
        
        scanner.close();
    }
}
