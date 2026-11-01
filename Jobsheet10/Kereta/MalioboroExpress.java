package Jobsheet10.Kereta;

public class MalioboroExpress extends KeretaEkspres implements EmergencyBrake, PowerSupply, Movement{
    private double hargaTiket;

    public MalioboroExpress(String nomorKereta, String masinis, int kecepatanMax, int gerbong, double hargaTiket){
        super(nomorKereta, masinis, kecepatanMax, gerbong);
        this.hargaTiket = hargaTiket;
    }

    public double getHargaTiket(){
        return hargaTiket;
    }

    public void setHargaTiket(double hargaTiket){
        this.hargaTiket = hargaTiket;
    }

   @Override
    public double hitungTarif(int jarakKm) {
       if (jarakKm < 100) {
        System.out.println("[INFO] Jarak < 100 km. Diberikan Tarif Khusus Flat.");
            return 75000.0;
        } else {
            System.out.println("[INFO] Jarak >= 150 km. Menggunakan Tarif Dasar + Per KM.");
            double tarifDasar = 30000.0;
            return tarifDasar + (jarakKm * hargaTiket);
        }
    }

    @Override
    public void cetakInformasi() {
        System.out.println("Kereta Malioboro Express");
        System.out.println("Nomor kereta     : " + getNoKereta());
        System.out.println("Masinis          : " + getMasinis());
        System.out.println("Kecepatan max    : " + getKecepatan() + "km/h");
        System.out.println("Jumlah gerbong   : " + getJumlahGerbong());
        System.out.println("Harga Tiket      : Rp." + getHargaTiket() + " Per KM");
        System.out.println("--------------------------------------------------------");
    }

    @Override 
    public void aktifkanRem() { 
        System.out.println("Malioboro Express: Rem darurat diaktifkan."); 
    }

    @Override 
    public void matikanRem() { 
        System.out.println("Malioboro Express: Rem darurat dimatikan."); 
    }

    @Override
    public void aktifkanListrik() { 
        System.out.println("Malioboro Express: Sistem listrik aktif."); 
    }

    @Override 
    public void matikanListrik() { 
        System.out.println("Malioboro Express: Sistem listrik mati."); 
    }

    @Override 
    public void maju() { 
        System.out.println("Malioboro Express: Berjalan maju."); 
    }

    @Override 
    public void mundur() { 
        System.out.println("Malioboro Express: Berjalan mundur."); 
    }

    @Override 
    public void berhenti() { 
        System.out.println("Malioboro Express: Berhenti."); 
    }

}
