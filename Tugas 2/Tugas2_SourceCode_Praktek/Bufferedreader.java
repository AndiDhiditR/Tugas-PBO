//1302020220151,Andi Dhidit Riyandy,Selasa 06 MAR 2024
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferedreader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("NIM: ");
        String nimBufferedReader = reader.readLine();
        
        System.out.print("Nama: ");
        String namaBufferedReader = reader.readLine();
        
        System.out.print("Jurusan: ");
        String jurusanBufferedReader = reader.readLine();
        
        System.out.print("Fakultas: ");
        String fakultasBufferedReader = reader.readLine();

        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("NIM: " + nimBufferedReader);
        System.out.println("Nama: " + namaBufferedReader);
        System.out.println("Jurusan: " + jurusanBufferedReader);
        System.out.println("Fakultas: " + fakultasBufferedReader);
        
        reader.close();
    }
}
