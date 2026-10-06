package Jobsheet06.Tugas;

class KeretaEksekutif extends KeretaApi {
    // Encapsulation: Ubah dari public ke private
    private boolean fasilitasLegrest;
    private boolean layananMakanGratis;

    // Constructor Tanpa Parameter
    public KeretaEksekutif() {
        super();
        this.fasilitasLegrest = false;
        this.layananMakanGratis = false;
    }

    // Constructor Berparameter
    public KeretaEksekutif(String kodeKereta, String namaKereta, int kapasitasKursi, 
                            double hargaTiketDasar, boolean fasilitasLegrest, boolean layananMakanGratis) {
        super(kodeKereta, namaKereta, kapasitasKursi, hargaTiketDasar);
        this.fasilitasLegrest = fasilitasLegrest;
        this.layananMakanGratis = layananMakanGratis;
    }

    public boolean isFasilitasLegrest() { 
        return fasilitasLegrest;
    }
    public void setFasilitasLegrest(boolean fasilitasLegrest) { 
        this.fasilitasLegrest = fasilitasLegrest; 
    }

    public boolean isLayananMakanGratis() { 
        return layananMakanGratis; 
    }
    public void setLayananMakanGratis(boolean layananMakanGratis) { 
        this.layananMakanGratis = layananMakanGratis; 
    }

    public void cekFasilitasLegrest() {
        if (fasilitasLegrest) {
            System.out.println("Fasilitas Legrest: Tersedia di setiap kursi.");
        } else {
            System.out.println("Fasilitas Legrest: Tidak tersedia.");
        }
    }

    public void layaniMakanMalam() {
        if (layananMakanGratis) {
            System.out.println("Layanan          : Penumpang mendapatkan hidangan makan malam gratis.");
        } else {
            System.out.println("Layanan          : Makanan dapat dipesan melalui kereta makan.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        cekFasilitasLegrest();
        layaniMakanMalam();
    }
}