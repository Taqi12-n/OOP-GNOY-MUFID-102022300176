class Mahasiswa {
    String nama;
    String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama + ", NIM: " + nim);
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Mufid", "102022300176");
        Mahasiswa mahasiswa2 = new Mahasiswa("Ahmad", "102022300177");
        Mahasiswa mahasiswa3 = new Mahasiswa("Siti", "102022300178");

        mahasiswa1.tampilkanData();
        mahasiswa2.tampilkanData();
        mahasiswa3.tampilkanData();
    }
}
