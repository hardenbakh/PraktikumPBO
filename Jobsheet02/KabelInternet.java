package Jobsheet02;

public class KabelInternet {
    
    public String merek;
    public String kategori; 
    public double panjangMeter;
    public double hargaPerMeter;

    public double getHitungTotalHarga() {
        return panjangMeter * hargaPerMeter;
    }

   public boolean cekKoneksi() {
        return panjangMeter <= 100;
    }

    // 5. METHOD 3 (void): Menampilkan seluruh info
    public void displayInfo() {
        System.out.println("Merek          : " + merek);
        System.out.println("Kategori       : " + kategori);
        System.out.println("Panjang        : " + panjangMeter + " meter");
        System.out.println("Koneksi Bagus? : " + cekKoneksi()); 
        System.out.println("Total Harga    : Rp " + getHitungTotalHarga());
        System.out.println();
    }
}
