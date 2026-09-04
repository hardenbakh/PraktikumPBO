package Jobsheet02;

public class KabelInternetDemo {
    public static void main(String[] args) {

        KabelInternet kabel1 = new KabelInternet();
        kabel1.merek = "Belden";
        kabel1.kategori = "CAT6";
        kabel1.panjangMeter = 15.0;
        kabel1.hargaPerMeter = 10000;

        KabelInternet kabel2 = new KabelInternet();
        kabel2.merek = "Vention";
        kabel2.kategori = "CAT7";
        kabel2.panjangMeter = 5.0;
        kabel2.hargaPerMeter = 25000;

        kabel1.displayInfo();
        kabel2.displayInfo();
    }
}