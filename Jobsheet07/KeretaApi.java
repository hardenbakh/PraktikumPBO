package Jobsheet07;

public class KeretaApi{
    private String nama;
    private double harga;

    public final String kodeOperator;

    public KeretaApi() {
    this("Kereta Default", 0.0, "KAI-DEF");
    }

    public KeretaApi(String nama, double harga, String kodeOperator){
        this.nama = nama;
        this.harga = harga;
        this.kodeOperator = kodeOperator;
    }

    public String getNama(){
        return nama;
    }

    public double getHarga(){
        return harga;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }


    // overloading
    public double hitungHarga(){
        return harga;
    }

    public double hitungHarga(int qty){
        return hitungHarga() * qty;
    }

    public void displayInfo(){
        System.out.println("Nama Kereta     :" + nama);
        System.out.println("Harga           :" + harga);
    }

    public void cetakNota(int qty){
        System.out.println("kode operator   :" + kodeOperator);
        displayInfo();
        System.out.println("Jumlah tiket    :" + qty);
        System.out.println("harga   : " + hitungHarga());
    }

}