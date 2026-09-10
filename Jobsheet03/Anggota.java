package Jobsheet03;

public class Anggota {

    private String nomorKTP;
    private String nama;
    private double limitPinjaman;
    private double jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, double limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public String getNama() {
        return nama;
    }

    public double getLimitPinjaman() {
        return limitPinjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(double uang) {
        if (jumlahPinjaman + uang <= limitPinjaman) {
            jumlahPinjaman += uang;
        } else {
            System.out.println(
                "Maaf, jumlah pinjaman melebihi limit!"
            );
        }
    }

    public void angsur(double uang) {

        double minimalAngsuran = jumlahPinjaman * 0.10;

        if (uang < minimalAngsuran) {
            System.out.println(
                "Maaf, angsuran harus 10% dari jumlah pinjaman"
            );
        } else if (uang > jumlahPinjaman) {
            System.out.println(
                "Maaf, jumlah angsuran melebihi jumlah pinjaman!"
            );
        } else {
            jumlahPinjaman -= uang;
        }
    }
}