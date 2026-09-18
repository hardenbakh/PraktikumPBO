package jobsheet04.SistemPertanian;
import java.util.ArrayList;

public class Petani {
    private String nama;
    private int pengalamanTahun;
    private ArrayList<Lahan> daftarLahan;

    public Petani(String nama, int pengalamanTahun) {
        this.nama = nama;
        this.pengalamanTahun = pengalamanTahun;
        this.daftarLahan = new ArrayList<Lahan>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPengalamanTahun() {
        return pengalamanTahun;
    }

    public void setPengalamanTahun(int pengalamanTahun) {
        this.pengalamanTahun = pengalamanTahun;
    }

    public ArrayList<Lahan> getDaftarLahan() {
        return daftarLahan;
    }

    public void tambahLahan(Lahan lahan) {
        this.daftarLahan.add(lahan);
    }

    public void tanam() {
        System.out.println(nama + " sedang menanam");
    }

    public void panen() {
        System.out.println(nama + " sedang memanen hasil");
    }

    public void jualHasil() {
        System.out.println(nama + " menjual hasil panen");
    }

    public String getInfo() {
        String info = "";
        info += "Nama Petani   : " + nama + "\n";
        info += "Pengalaman    : " + pengalamanTahun + " tahun\n";

        if (!daftarLahan.isEmpty()) {
            info += "--- Daftar Lahan --- \n";
            for (Lahan lahan : daftarLahan) {
                info += lahan.getInfo() + "\n";
            }
        } else {
            info += "Belum ada lahan yang dikelola/dimiliki\n";
        }

        return info;
    }
}