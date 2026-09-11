package Jobsheet03;

public class DemoSmartphone {
    public static void main(String[] args) {


        Smartphone hp1 = new Smartphone("Samsung", "Hitam", 8, 128);
        hp1.tampilkanInfo();
        hp1.ambilFoto();
        hp1.setTurnOnOrOff(false);
        hp1.ambilFoto();
        hp1.kirimPesan();
        hp1.ambilFoto();
        hp1.setWarna("Silver");
        hp1.setRam(12);

        hp1.tampilkanInfo();

        
        Smartphone hp2 = new Smartphone();
        hp2.tampilkanInfo();
    }
}