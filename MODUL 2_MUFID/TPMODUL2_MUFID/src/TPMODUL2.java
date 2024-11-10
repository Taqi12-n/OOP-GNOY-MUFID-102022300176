class Hewan {
    public String nama;
    public int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void suara() {
        System.out.println("Hewan bersuara");
    }

    public void makan() {
        System.out.println(nama + " suka makan");
    }

    public void makan(String makanan) {
        System.out.println(nama + " suka makan " + makanan);
    }

    public void info() {
        System.out.println("Nama: " + nama + " Umur: " + umur);
    }
}

class Kucing extends Hewan {
    private String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    public void suara() {
        System.out.println(nama + " mengeong");
    }

    public void info() {
        System.out.println("Nama: " + nama + " Umur: " + umur + " Ras: " + ras);
    }
}

class Burung extends Hewan {
    private String bulu;

    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.bulu = warnaBulu;
    }

    public void suara() {
        System.out.println(nama + " berkicau");
    }

    public void info() {
        System.out.println("Nama: " + nama + " Umur: " + umur + " Warna Bulu: " + bulu);
    }
}

public class TPMODUL2 {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Maung", 3, "Persia");
        kucing.info();      
        kucing.suara();          
        kucing.makan();       
        kucing.makan("ikan"); 

        System.out.println();

        Burung burung = new Burung("Manuk", 2, "Kuning");
        burung.info();      
        burung.suara();        
        burung.makan();         
        burung.makan("biji bijian");
    }
}