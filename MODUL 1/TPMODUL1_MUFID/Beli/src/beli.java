import java.util.ArrayList;
import java.util.Scanner;

class Penerbangan {
    private String nomorpenerbangan;
    private String bandaraberangkat;
    private String bandaratujuan;
    private String waktuberangkat;
    private String waktunyampe;
    private float harga;

    public Penerbangan(String nomorpenerbangan, String bandaraberangkat, String bandaratujuan, String waktuberangkat, String waktunyampe, float hargatiket) {
        this.nomorpenerbangan = nomorpenerbangan;
        this.bandaraberangkat = bandaraberangkat;
        this.bandaratujuan = bandaratujuan;
        this.waktuberangkat = waktuberangkat;
        this.waktunyampe = waktunyampe;
        this.harga = hargatiket;
    }

    public String getNomorpenerbangan() {
        return nomorpenerbangan;
    }

    public String getBandaraberangkat() {
        return bandaraberangkat;
    }

    public String getBandaratujuan() {
        return bandaratujuan;
    }

    public String getWaktuberangkat() {
        return waktuberangkat;
    }

    public String getWaktunyampe() {
        return waktunyampe;
    }

    public float getHarga() {
        return harga;
    }

    public void listpenerbangan() {
        System.out.println("Nomor Penerbangan: " + nomorpenerbangan);
        System.out.println("Bandara Keberangkatan: " + bandaraberangkat);
        System.out.println("Bandara Tujuan: " + bandaratujuan);
        System.out.println("Waktu Keberangkatan: " + waktuberangkat);
        System.out.println("Waktu Kedatangan: " + waktunyampe);
        System.out.println("Harga Tiket: " + harga);
        System.out.println();
    }
}

class penumpang {
    private String ID;
    private String namadepan;
    private String namabelakang;

    public penumpang(String ID, String namadepan, String namabelakang) {
        this.ID = ID;
        this.namadepan = namadepan;
        this.namabelakang = namabelakang;
    }

    public void daftarpenumpang() {
        System.out.println("ID: " + ID);
        System.out.println("Nama Depan: " + namadepan);
        System.out.println("Nama Belakang: " + namabelakang);
        System.out.println();
    }
}

public class beli {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Penerbangan> daftarpenerbangan = new ArrayList<>();

        daftarpenerbangan.add(new Penerbangan("GA123", "CGK", "DPS", "08:99", "11:00", 5000.0f));
        daftarpenerbangan.add(new Penerbangan("JT456", "DPS", "BDO", "14:50", "16:00", 4000.0f));
        daftarpenerbangan.add(new Penerbangan("ID789", "BDO", "CGK", "16:00", "16:63", 3000.0f));

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Pesan Tiket");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Penerbangan:");
                    for (int i = 0; i < daftarpenerbangan.size(); i++) {
                        System.out.println((i+1) + ". " + daftarpenerbangan.get(i).getNomorpenerbangan());
                    }
                    System.out.println();
                    break;
                case 2:
                    input.nextLine();
                    String ID = "102022300176"; 
                    String namadepan = "MUFID";
                    String namabelakang = "SI4710";

                    System.out.print("Pilih nomor penerbangan: ");
                    int xpenerbangan = input.nextInt() - 1;

                    System.out.println("Pesanan Tiket:");
                    daftarpenerbangan.get(xpenerbangan).listpenerbangan();
                    System.out.println("Penumpang:");
                    penumpang penumpang = new penumpang(ID, namadepan, namabelakang);
                    penumpang.daftarpenumpang();
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }
        } while (pilihan != 3);

        input.close();
    }
}