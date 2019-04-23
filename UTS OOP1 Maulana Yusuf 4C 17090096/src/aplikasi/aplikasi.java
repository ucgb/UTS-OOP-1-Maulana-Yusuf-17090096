package aplikasi;

import service.*;
import entity.*;
import java.util.*;

public class aplikasi {

    private static Service service;
    private static Scanner scanner;

    public static void main(String[] args) {
        service = new Service();
        scanner = new Scanner(System.in);

        int opsi = 5;
        do {
            showMenu();
            try {
                scanner = new Scanner(System.in);
                opsi = scanner.nextInt();
            } catch(InputMismatchException e) {
                System.err.println("Apa yang Anda masukan salah");
                opsi = 0;
            } catch(NoSuchElementException nsee) {

            }
            prosesOpsi(opsi);
        } while(opsi != 5);
    }

    private static void prosesOpsi(int pilihan) {
        switch(pilihan) {
            case 1:
                showFormTambahData();
                break;
            case 2:
                showFormEditData();
                break;
            case 3:
                showDeleteData();
                break;
            case 4:
                service.showAllData();
                break;
            case 5:
                System.out.println("Terima kasih telah menggunakan Aplikasi Service HP kami");
        }
    }

    private static void showDeleteData() {
        scanner = new Scanner(System.in);
        System.out.println("\nForm Hapus Data");
        System.out.print("ID : ");
        String id = scanner.nextLine();
        service.deleteData(id);
    }

    private static void showFormEditData() {
        scanner = new Scanner(System.in);
        String id, pelanggan, merk;

        System.out.println("\nForm Ubah Data");
        System.out.print("ID PELANGGAN : ");
        id = scanner.nextLine();
        System.out.print("NAMA PELANGGAN : ");
        pelanggan = scanner.nextLine();
        System.out.print("MERK HP: ");
        merk = scanner.nextLine();
        service.updateData(new HP(id, pelanggan, merk));
    }

    private static void showFormTambahData() {
        scanner = new Scanner(System.in);
        String id, pelanggan, merk;

        System.out.println("\nForm Entry Data");
        System.out.print("ID PELANGGAN : ");
        id = scanner.nextLine();
        System.out.print("NAMA PELANGGAN : ");
        pelanggan = scanner.nextLine();
        System.out.print("MERK HP : ");
        merk = scanner.nextLine();
        service.addData(new HP(id, pelanggan, merk));
    }

    private static void showMenu() {
        System.out.println("Menu Aplikasi Service HP");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. KELUAR");
        System.out.println("-------------------");
        System.out.print  ("pilihan > ");
    }

}