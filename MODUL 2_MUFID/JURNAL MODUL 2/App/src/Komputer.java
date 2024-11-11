class Komputer {
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float hargaPerJam;

    public Komputer(int jumlahKomputer, String namaWaret, float hargaPerJam) {
        this.jumlahKomputer = jumlahKomputer;
        this.namaWarnet = namaWaret;
        this.hargaPerJam = hargaPerJam;
    }

    public void Informasi() {
        System.out.println("Nama Warnet: " + namaWarnet);
        System.out.println("Jumlah Komputer: " + jumlahKomputer);
        System.out.println("Harga per Jam: " + hargaPerJam);
    }
    // To do: Buatlah Method Informasi dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)

}