package Jobsheet06.Tugas;

class KeretaEkonomi extends KeretaApi {
    private String penataanKursi;
    private boolean subsidiPSO;

    public KeretaEkonomi() {
        super(); 
        this.penataanKursi = "Belum diatur";
        this.subsidiPSO = false;
    }

    public KeretaEkonomi(String kodeKereta, String namaKereta, int kapasitasKursi, 
                          double hargaTiketDasar, String penataanKursi, boolean subsidiPSO) {
        super(kodeKereta, namaKereta, kapasitasKursi, hargaTiketDasar);
        this.penataanKursi = penataanKursi;
        this.subsidiPSO = subsidiPSO;
    }

    public String getPenataanKursi() { 
        return penataanKursi; 
    }
    public void setPenataanKursi(String penataanKursi) { 
        this.penataanKursi = penataanKursi; 
    }

    public boolean isSubsidiPSO() { 
        return subsidiPSO; 
    }
    public void setSubsidiPSO(boolean subsidiPSO) { 
        this.subsidiPSO = subsidiPSO; 
    }

    public void cekStatusSubsidi() {
        if (subsidiPSO) {
            System.out.println("Status Subsidi   : Ya (Mendapatkan potongan subsidi pemerintah PSO)");
        } else {
            System.out.println("Status Subsidi   : Non-Subsidi (Komersial)");
        }
    }

    public double hitungHargaTiket() {
        if (subsidiPSO) {
            return getHargaTiketDasar() * 0.5; // Potongan 50% jika subsidi
        }
        return getHargaTiketDasar();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Penataan Kursi   : " + penataanKursi);
        cekStatusSubsidi();
        System.out.println("Harga Tiket Pas  : Rp " + hitungHargaTiket());
    }
}