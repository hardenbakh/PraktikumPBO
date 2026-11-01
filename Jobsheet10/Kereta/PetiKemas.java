package Jobsheet10.Kereta;

public class PetiKemas extends KeretaKargo implements EmergencyBrake, PowerSupply, Movement{
    private double beratMaksTon;

    public PetiKemas(String nomorKereta, String masinis, int kecepatanMax, int kapasitasKargo, double beratMaksTon){
        super(nomorKereta, masinis, kecepatanMax, kapasitasKargo);
        this.beratMaksTon = beratMaksTon;
    }

    public double getBeratMaksTon(){
        return beratMaksTon;
    }

    public void setBeratMaksTon(double beratMaksTon){
        this.beratMaksTon = beratMaksTon;
    }

    @Override
    public double hitungTarif(int jarakKm) {
        double tarifPerTonKm = 2500.0;
        return jarakKm * beratMaksTon * tarifPerTonKm;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("Kereta Barang (peti kemas)");
        System.out.println("Nomor kereta     : " + getNoKereta());
        System.out.println("Masinis          : " + getMasinis());
        System.out.println("Kecepatan max    : " + getKecepatan() + "km/h");
        System.out.println("Kapasitas kargo  : " + getKapasitasKargo());
        System.out.println("Berat Maks (Ton) : " + getBeratMaksTon());
        System.out.println("--------------------------------------------------------");
    }

    @Override 
    public void aktifkanRem() { 
        System.out.println("Kereta Petikemas: Rem darurat diaktifkan."); 
    }

    @Override 
    public void matikanRem() { 
        System.out.println("Kereta Petikemas: Rem darurat dimatikan."); 
    }

    @Override 
    public void aktifkanListrik() { 
        System.out.println("Kereta Petikemas: Sistem listrik aktif."); 
    }

    @Override 
    public void matikanListrik() { 
        System.out.println("Kereta Petikemas: Sistem listrik mati."); 
    }

    @Override 
    public void maju() { 
        System.out.println("Kereta Petikemas: Berjalan maju."); 
    }

    @Override 
    public void mundur() { 
        System.out.println("Kereta Petikemas: Berjalan mundur."); 
    }

    @Override 
    public void berhenti() { 
        System.out.println("Kereta Petikemas: Berhenti."); 
    }
}
