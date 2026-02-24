/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testing;

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
import java.util.Scanner;

class Transaksi {
    String nama;
    String layanan;
    double jumlah;
    double total;

    Transaksi(String nama, String layanan, double jumlah, double total) {
        this.nama = nama;
        this.layanan = layanan;
        this.jumlah = jumlah;
        this.total = total;
    }

    void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Layanan: " + layanan);
        System.out.println("Jumlah/Berat: " + jumlah);
        System.out.println("Total: Rp " + total);
        System.out.println("-------------------");
    }
}

public class LaundryDel {

    static ArrayList<Transaksi> daftar = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void tambahTransaksi() {
        System.out.print("Nama Pelanggan: ");
        String nama = sc.nextLine();

        System.out.println("1. Cuci Kiloan (Rp7000/kg)");
        System.out.println("2. Cuci Satuan (Rp5000/item)");
        System.out.print("Pilih: ");
        int pilih = sc.nextInt();

        double jumlah;
        double total;
        String layanan;

        if (pilih == 1) {
            layanan = "Cuci Kiloan";
            System.out.print("Berat (kg): ");
            jumlah = sc.nextDouble();
            total = jumlah * 7000;
        } else {
            layanan = "Cuci Satuan";
            System.out.print("Jumlah item: ");
            jumlah = sc.nextDouble();
            total = jumlah * 5000;
        }

        sc.nextLine(); // buang enter

        daftar.add(new Transaksi(nama, layanan, jumlah, total));
        System.out.println("Transaksi berhasil ditambah\n");
    }

    public static void tampilSemua() {
        if (daftar.isEmpty()) {
            System.out.println("Belum ada transaksi\n");
            return;
        }

        for (Transaksi t : daftar) {
            t.tampil();
        }
    }

    public static void main(String[] args) {
        int menu;

        do {
            System.out.println("=== LAUNDRY C ===");
            System.out.println("1. Tambah Transaksi");
            System.out.println("2. Lihat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1 -> tambahTransaksi();
                case 2 -> tampilSemua();
            }

        } while (menu != 0);
    }
}