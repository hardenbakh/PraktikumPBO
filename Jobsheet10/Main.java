package Jobsheet10;

public class Main {
    public static void main(String[] args) {
        
        Kipas kipas = new Kipas("Standing Fan", 250000.0, "Putih", "Maspion");
        kipas.tampilkanInformasi();
        System.out.println();

        TV tv = new TV("LED 32 Inch", 15, 2000000.0, "Hitam", "Samsung");
        tv.naikkanVolume(5);
        tv.tampilkanInformasi();
        System.out.println();

        Kulkas kulkas = new Kulkas(2, 3500000.0, "Silver", "Sharp");
        kulkas.tampilkanInformasi();
        System.out.println();

        SmartFridge smartFridge = new SmartFridge(10, 2, 7000000.0, "Dark Gray", "LG");
        smartFridge.naikkanVolume(3);
        smartFridge.tampilkanInformasi();
    }
}
