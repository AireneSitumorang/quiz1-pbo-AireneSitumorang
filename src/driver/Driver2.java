package driver;

import java.util.Scanner;

public class Driver2  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input jumlah data
        System.out.print("Jumlah data: ");
        int N = sc.nextInt();

        int[] nilai = new int[N];
        int[] kelompok = new int[N]; // simpan kode kelompok tiap nilai

        // Input nilai + kode kelompok
        System.out.println("Masukkan nilai dan kode kelompok:");
        for (int i = 0; i < N; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();

            System.out.print("Kode kelompok nilai tersebut: ");
            kelompok[i] = sc.nextInt();
        }

        int pilih;
        do {
            System.out.print("\nPilih kode kelompok yang ingin dihitung (0 keluar): ");
            pilih = sc.nextInt();

            int total = 0;
            boolean ada = false;

            for (int i = 0; i < N; i++) {
                if (kelompok[i] == pilih) {
                    total += nilai[i];
                    ada = true;
                }
            }

            if (pilih == 0) break;

            if (ada) {
                System.out.println("Total nilai kelompok " + pilih + " = " + total);
            } else {
                System.out.println("Kelompok tidak ada!");
            }

        } while (true);

        System.out.println("Program selesai");
    }
}