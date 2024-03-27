//1302020220151,Andi Dhidit Riyandy,Rabu 13 MAR 2024
import java.util.Scanner;

/* Membaca jari-jari, menghitung luas lingkaran */
/* latihan pemakaian konstanta */
public class T8 {
    /**
    * @param args
    */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        /* Kamus */
        final float PHI = 3.1415f;
        float r;
        Scanner masukan = new Scanner(System.in);
        
        /* Program */
        /* Baca data */
        System.out.print("Jari-jari lingkaran = ");
        r = masukan.nextFloat();
        
        /* Hitung dan tulis hasil */
        System.out.print("Luas lingkaran = " + (PHI * r * r) + "\n");
        System.out.print("Akhir program\n");
    }
}
