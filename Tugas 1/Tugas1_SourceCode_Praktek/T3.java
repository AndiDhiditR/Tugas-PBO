//1302020220151,Andi Dhidit Riyandy,Minggu 25 FEB 2024
public class T3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        /* KAMUS */
        short ks = 1;
        int ki = 1;
        long kl = 10000L; // Perhatikan penambahan "L" pada inisialisasi long
        char c = 65; /* inisialisasi karakter dengan integer */
        char c1 = 'Z'; /* inisialisasi karakter dengan karakter */
        double x = 50.2;
        float y = 50.2f;
        
        /* Algoritma */
        /* penulisan karakter sebagai karakter */
        System.out.println("Karakter = " + c);
        System.out.println("Karakter = " + c1);
        /* penulisan karakter sebagai integer */
        System.out.println("Karakter = " + (int) c); // Casting c ke int
        System.out.println("Karakter = " + (int) c1); // Casting c1 ke int
        System.out.println("Bilangan integer (short) = " + ks);
        System.out.println("\t(int) = " + ki);
        System.out.println("\t(long)= " + kl);
        System.out.println("Bilangan Real x = " + x);
        System.out.println("Bilangan Real y = " + y);
    }
}
