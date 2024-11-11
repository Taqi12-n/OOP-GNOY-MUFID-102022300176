public class Main {
    public static void main(String[] args) {

        Komputer komputer = new Komputer(5, "Anjaynet", 2500);
        komputer.Informasi();

        System.out.println();

        KomputerVIP komputerVIP = new KomputerVIP(10, "Anjaynet VIP", 5000, true);
        komputerVIP.Informasi();
        komputerVIP.Login("UserVIP");
        komputerVIP.Bermain(2); 
        komputerVIP.Bermain(1, 30); 
        System.out.println();

        KomputerPremium komputerPremium = new KomputerPremium(7, "Anjaynet Premium", 7500, true);
        komputerPremium.Informasi();
        komputerPremium.Pesan(3);
        komputerPremium.Pesen("Makanan ringan");
        komputerPremium.Pesen("Makanan ringan", "Minuman dingin");  
    }
}
