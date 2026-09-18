package jobsheet04.SistemPertanian;
import java.util.ArrayList;

public class Lahan {
    private double luas;
    private String lokasi;
    private String peruntukan;
    private ArrayList<Petak> daftarPetak;

    public Lahan(double luas, String lokasi, String peruntukan) {
        this.luas = luas;
        this.lokasi = lokasi;
        this.peruntukan = peruntukan;
        this.daftarPetak = new ArrayList<Petak>();
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getPeruntukan() {
        return peruntukan;
    }

    public void setPeruntukan(String peruntukan) {
        this.peruntukan = peruntukan;
    }

    public ArrayList<Petak> getDaftarPetak() {
        return daftarPetak;
    }

    public void tambahPetak(Petak petak) {
        this.daftarPetak.add(petak);
    }

    public double hitungTotalLuas() {
        double total = 0;
        for (Petak p : daftarPetak) {
            total += p.getLuasPetak();
        }
        return total;
    }

    public String getInfo() {
        String info = "";
        info += "Lokasi Lahan  : " + lokasi + "\n";
        info += "Luas Lahan    : " + luas + " m2\n";
        info += "Peruntukan    : " + peruntukan + "\n";

        if (!daftarPetak.isEmpty()) {
            info += "Daftar Petak  :\n";
            for (Petak petak : daftarPetak) {
                info += "\tPetak No. " + petak.getNomorPetak()
                        + ", Luas: " + petak.getLuasPetak() + " m2"
                        + ", Status: " + (petak.isStatusTanam() ? "sudah ditanami" : "belum ditanami")
                        + "\n";
            }
            info += "Total Luas Petak: " + hitungTotalLuas() + " m2\n";
        } else {
            info += "Belum ada petak pada lahan ini\n";
        }

        return info;
    }
}