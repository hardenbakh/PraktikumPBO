package Jobsheet06.Tugas;

class KeretaApi {

    private String kodeKereta;
    private String namaKereta;
    private int kapasitasKursi;
    private double hargaTiketDasar;

    public KeretaApi() {
        this.kodeKereta = "Belum diisi";
        this.namaKereta = "Belum diisi";
        this.kapasitasKursi = 0;
        this.hargaTiketDasar = 0.0;
    }

    public KeretaApi(String kodeKereta, String namaKereta, int kapasitasKursi, double hargaTiketDasar) {
        this.kodeKereta = kodeKereta;
        this.namaKereta = namaKereta;
        this.kapasitasKursi = kapasitasKursi;
        this.hargaTiketDasar = hargaTiketDasar;
    }

    public String getKodeKereta() { 
        return kodeKereta; 
    }

    public void setKodeKereta(String kodeKereta) { 
        this.kodeKereta = kodeKereta; 
    }

    public String getNamaKereta() { 
        return namaKereta; 
    }
    public void setNamaKereta(String namaKereta) { 
        this.namaKereta = namaKereta; 
    }

    public int getKapasitasKursi() { 
        return kapasitasKursi; 
    }
    public void setKapasitasKursi(int kapasitasKursi) { 
        this.kapasitasKursi = kapasitasKursi; 
    }

    public double getHargaTiketDasar() { 
        return hargaTiketDasar; 
    }
    public void setHargaTiketDasar(double hargaTiketDasar) { 
        this.hargaTiketDasar = hargaTiketDasar; 
    }

    public void displayInfo() {
        System.out.println("Kode Kereta      : " + kodeKereta);
        System.out.println("Nama Kereta      : " + namaKereta);
        System.out.println("Kapasitas        : " + kapasitasKursi + " kursi");
        System.out.println("Harga Dasar      : Rp " + hargaTiketDasar);
    }
}