/**
 *
 * 1302020220151,Andi Dhidit Riyandy,Rabu 27 MAR 2024
 */
import java.util.HashMap;
import java.util.Scanner;

public class HasMaps7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();

        System.out.println("\n=== Masukkan kunci-nilai ke dalam HashMap (ketik 'keluar' untuk mengakhiri) ===");

        String input;
        while (true) {
            System.out.print("Masukkan kunci(Karakter)  : ");
            input = scanner.nextLine();

            if (input.equals("keluar")) {
                break;
            }

            String key = input;

            System.out.print("Masukkan nilai(Bil.Bulat) : ");
            input = scanner.nextLine();
            int value = Integer.parseInt(input);

            hashMap.put(key, value);
        }

        System.out.println("\nIsi HashMap :");
        for (String key : hashMap.keySet()) {
            System.out.println("Kunci : " + key + ", Nilai : " + hashMap.get(key));
        }

        scanner.close();
    }
}
