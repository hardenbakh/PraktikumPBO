package Jobsheet02;

public class KabelInternet {
    
    public String merek;
    public String kategori; 
    public double panjangMeter;
    public double hargaPerMeter;

    public double getHitungTotalHarga() {
        return panjangMeter * hargaPerMeter;
    }

    public void displayInfo() {
        System.out.println("Merek          : " + merek);
        System.out.println("Kategori Kabel : " + kategori);
        System.out.println("Panjang Kabel  : " + panjangMeter + " meter");
        System.out.println("Harga / Meter  : Rp " + hargaPerMeter);
        System.out.println("Total Harga    : Rp " + getHitungTotalHarga());
        System.out.println();
    }
}