/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttespbo1;
import java.util.ArrayList;
import java.util.Scanner;

public class PostTesPBO1 {

    public static void main(String[] args) {
        ArrayList<String> showroom = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            // Menu utama
            System.out.println("MANAJEMEN DATA SHOWROOM MOBIL SPORT");
            System.out.println("1. Tambah Data Mobil");
            System.out.println("2. Lihat Semua Data");
            System.out.println("3. Ubah Data Mobil");
            System.out.println("4. Hapus Data Mobil");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang enter

            switch (pilihan) {
                case 1: // CREATE
                    System.out.print("Merk  : ");
                    String merk = input.nextLine();
                    System.out.print("Model : ");
                    String model = input.nextLine();
                    System.out.print("Tahun : ");
                    String tahun = input.nextLine();
                    System.out.print("Harga : ");
                    String harga = input.nextLine();
                    System.out.print("Status (Tersedia/Terjual): ");
                    String status = input.nextLine();

                    showroom.add(merk + " | " + model + " | " + tahun + " | " + harga + " | " + status);
                    System.out.println("Data mobil berhasil ditambahkan!");
                    break;

                case 2: // READ
                    System.out.println("DAFTAR MOBIL SHOWROOM");
                    if (showroom.isEmpty()) {
                        System.out.println("(Belum ada data mobil)");
                    } else {
                        for (int i = 0; i < showroom.size(); i++) {
                            System.out.println((i + 1) + ". " + showroom.get(i));
                        }
                    }
                    break;

                case 3: // UPDATE
                    System.out.println("UBAH DATA MOBIL");
                    if (showroom.isEmpty()) {
                        System.out.println("(Belum ada data mobil)");
                        break;
                    }
                    for (int i = 0; i < showroom.size(); i++) {
                        System.out.println((i + 1) + ". " + showroom.get(i));
                    }
                    System.out.print("Pilih nomor mobil yang ingin diubah: ");
                    int ubah = input.nextInt();
                    input.nextLine();

                    if (ubah > 0 && ubah <= showroom.size()) {
                        System.out.print("Merk baru   : ");
                        String merkBaru = input.nextLine();
                        System.out.print("Model baru  : ");
                        String modelBaru = input.nextLine();
                        System.out.print("Tahun baru  : ");
                        String tahunBaru = input.nextLine();
                        System.out.print("Harga baru  : ");
                        String hargaBaru = input.nextLine();
                        System.out.print("Status baru : ");
                        String statusBaru = input.nextLine();

                        showroom.set(ubah - 1, merkBaru + " | " + modelBaru + " | " + tahunBaru + " | " + hargaBaru + " | " + statusBaru);
                        System.out.println("Data mobil berhasil diubah!");
                    } else {
                        System.out.println("Nomor mobil tidak valid.");
                    }
                    break;

                case 4: // DELETE
                    System.out.println("HAPUS DATA MOBIL");
                    if (showroom.isEmpty()) {
                        System.out.println("(Belum ada data mobil)");
                        break;
                    }
                    for (int i = 0; i < showroom.size(); i++) {
                        System.out.println((i + 1) + ". " + showroom.get(i));
                    }
                    System.out.print("Pilih nomor mobil yang ingin dihapus: ");
                    int hapus = input.nextInt();
                    input.nextLine();

                    if (hapus > 0 && hapus <= showroom.size()) {
                        showroom.remove(hapus - 1);
                        System.out.println("Data mobil berhasil dihapus!");
                    } else {
                        System.out.println("Nomor mobil tidak valid.");
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia, coba lagi.");
            }

        } while (pilihan != 5);
    }
}
    

