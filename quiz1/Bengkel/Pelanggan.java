package quiz1.Bengkel;

import java.util.ArrayList;

public class Pelanggan {
    private String nama;
    private String noTelepon;
    private ArrayList<Kendaraan> daftarKendaraan;

    public Pelanggan(String nama, String noTelepon) {
        this.nama = nama;
        this.noTelepon = noTelepon;
        this.daftarKendaraan = new ArrayList<>();
    }

    public void tambahKendaraan(Kendaraan k) {
        this.daftarKendaraan.add(k);
        k.setPemilik(this);
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelepon() {
        return noTelepon;
    }
}