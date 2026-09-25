package quiz1.Bengkel;

public class Kendaraan {
    private String platNomor;
    private String merek;
    private String model;
    private String tipeKendaraan;
    private Pelanggan pemilik;

    public Kendaraan(String platNomor, String merek, String model, String tipeKendaraan) {
        this.platNomor = platNomor;
        this.merek = merek;
        this.model = model;
        this.tipeKendaraan = tipeKendaraan;
    }

    public double getBiayaTambahan() {
        if (tipeKendaraan.equalsIgnoreCase("Mobil")) {
            return 50000;
        } else if (tipeKendaraan.equalsIgnoreCase("Sepeda Motor")) {
            return 20000;
        }
        return 0;
    }

    public void setPemilik(Pelanggan pemilik) {
        this.pemilik = pemilik;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public String getMerek() {
        return merek;
    }

    public String getModel() {
        return model;
    }

    public String getTipeKendaraan() {
        return tipeKendaraan;
    }
}