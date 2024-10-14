import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    private static ArrayList<String> daftarBarang = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        tambahBarangElektronik();

        tambahBarangNonElektronik();

        tampilkanSemuaBarang();
    }

    public static void tambahBarangElektronik() {
        System.out.println("== Tambah Barang Elektronik ==");
        System.out.print("Nama Barang: ");
        String nama = scanner.nextLine();
        System.out.print("Jumlah Barang: ");
        int jumlah = scanner.nextInt();
        System.out.print("Harga Barang: ");
        double harga = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Garansi Barang: ");
        String garansi = scanner.nextLine();

        String barangElektronik = String.format("Nama: %s, Jumlah: %d, Harga: %.2f, Garansi: %s", nama, jumlah, harga, garansi);
        daftarBarang.add(barangElektronik);

        System.out.println("Barang elektronik berhasil ditambahkan.");
    }

    public static void tambahBarangNonElektronik() {
        System.out.println("== Tambah Barang Non-elektronik ==");
        System.out.print("Nama Barang: ");
        String nama = scanner.nextLine();
        System.out.print("Jumlah Barang: ");
        int jumlah = scanner.nextInt();
        System.out.print("Harga Barang: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Material Barang: ");
        String material = scanner.nextLine();

        String barangNonElektronik = String.format("N", nama, jumlah, harga, material);
        daftarBarang.add(barangNonElektronik);

        System.out.println("Barang non-elektronik berhasil ditambahkan.");
    }

    public static void tampilkanSemuaBarang() {
        System.out.println("== Daftar Barang dalam Inventaris ==");
        if (daftarBarang.isEmpty()) {
            System.out.println("Tidak ada barang dalam inventaris.");
        } else {
            for (String barang : daftarBarang) {
                System.out.println(barang);
            }
        }
    }
}
