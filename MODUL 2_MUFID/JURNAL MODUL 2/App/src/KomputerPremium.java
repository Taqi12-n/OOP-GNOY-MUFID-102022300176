class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;
    // Class KomputerPremium yang merupakan s
    // To do: Buatlah constructor pada class KomputerPremium

    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }
    
        @Override
        public void Informasi() {
            super.Informasi();
            if (ruangPrivat) {
                System.out.println("Benefit Ruang Premium:");
                System.out.println("1. Tidak mudah terbakar");
                System.out.println("2. Tidak didatangi dajal");
                System.out.println("3. All you can eat");
            }
                
            else {
                System.out.println("Fasilitas Ruang Standar");
                System.out.println("1. Komputer mudah belah");
                System.out.println("2. Meja Rapuh");
                System.out.println("3. Suasana india");
            }
        }
    
        public void Login(String username) {
            System.out.println(username + " Telah login");
        }
    
        public void Bermain(int jam) {
            System.out.println("Bermain selama " + jam + " jam");
        }
    
        public void Bermain(int jam, int menit) {
            System.out.println("Bermain selama " + jam + " jam " + menit + " menit");
        }
    }
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
