package quiz1.Bengkel;

public class Karyawan {
    private String idKaryawan;
    private String namaKaryawan;
    private String posisi;

    public Karyawan(String idKaryawan, String namaKaryawan, String posisi) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.posisi = posisi;
    }

    public double prosesTransaksi(Layanan layanan, Kendaraan kendaraan) {
        double totalBiaya = layanan.getServicePrice() + kendaraan.getBiayaTambahan();
        
        System.out.println("[" + kendaraan.getTipeKendaraan() + "] " + kendaraan.getMerek() + " " + kendaraan.getModel() + " (" + kendaraan.getPlatNomor() + ")");
        System.out.println("Layanan : " + layanan.getServiceName());
        System.out.println("Biaya   : Rp " + totalBiaya);
        System.out.println();
        
        return totalBiaya;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public String getPosisi() {
        return posisi;
    }
}