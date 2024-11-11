class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean vipCard;
    // To do: Buatlah constructor pada class KomputerVIP
    
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!    
        @Override
        public void Informasi() {
            super.Informasi();
            if (vipCard) {
                System.out.println("Benefit Member VIP:");
                System.out.println("1. Bisa tiduran");
                System.out.println("2. Netflix seumur hidup");
                System.out.println("3. All you can eat");
            }

            else {
                System.out.println("Minimal VIP bos");
            }
        }
    
        public void Login(String username) {
            System.out.println(username + " Telah login");
        }
    
        public void Bermain(int jam) {
            System.out.println("Bermain selama " + jam + " jam");
        }
    
        public void Bermain(int jam, int menitTambahan) {
            System.out.println("Bermain selama " + jam + " jam " + menitTambahan + " menit");
        }
    }
    
    // To do: Buatlah method Login sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan