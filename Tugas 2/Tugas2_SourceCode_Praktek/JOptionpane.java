//1302020220151,Andi Dhidit Riyandy,Selasa 06 MAR 2024
import javax.swing.JOptionPane;

public class JOptionpane {
    public static void main(String[] args) {
        String nimJOptionPane = JOptionPane.showInputDialog("NIM:");
        String namaJOptionPane = JOptionPane.showInputDialog("Nama:");
        String jurusanJOptionPane = JOptionPane.showInputDialog("Jurusan:");
        String fakultasJOptionPane = JOptionPane.showInputDialog("Fakultas:");

        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("NIM: " + nimJOptionPane);
        System.out.println("Nama: " + namaJOptionPane);
        System.out.println("Jurusan: " + jurusanJOptionPane);
        System.out.println("Fakultas: " + fakultasJOptionPane);
    }
}
