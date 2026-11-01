package Jobsheet10.Kereta;

public class Dhoho extends KeretaEkonomi implements EmergencyBrake, PowerSupply, Movement {
    private final double tarifPSO = 15000.00;

    public Dhoho(String nomorKereta, String masinis, int kecepatanMax, int jumlahPenumpang){
        super(nomorKereta, masinis, kecepatanMax, jumlahPenumpang);
    }

    public double getTarifPSO(){
        return tarifPSO;
    }

    @Override
    public double hitungTarif(int jarakKM) {
        return tarifPSO;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("Kereta Ekonomi Dhoho (PSO)");
        System.out.println("Nomor kereta     : " + getNoKereta());
        System.out.println("Masinis          : " + getMasinis());
        System.out.println("Kecepatan max    : " + getKecepatan() + "km/h");
        System.out.println("Jumlah penumpang : " + getJumlahPenumpang());
        System.out.println("Tarif PSO (flat) : Rp " + tarifPSO);
        System.out.println("--------------------------------------------------------");

    }

    @Override
    public void aktifkanRem() {
        System.out.println("Dhoho : Rem darurat diaktifkan");
    }

    @Override
    public void matikanRem() { 
        System.out.println("Dhoho : Rem darurat dimatikan."); 
    }

    @Override
    public void aktifkanListrik() { 
        System.out.println("Dhoho: Sistem listrik aktif."); 
    }

    @Override
    public void matikanListrik() { 
        System.out.println("Dhoho: Sistem listrik mati."); 
    }

    @Override
    public void maju() { 
        System.out.println("Dhoho: Berjalan maju."); 
    }

    @Override
    public void mundur() { 
        System.out.println("Dhoho: Berjalan mundur."); 
    }

    @Override
    public void berhenti() { 
        System.out.println("Dhoho: Berhenti."); 
    }

}
