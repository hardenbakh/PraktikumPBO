package quiz1.Bengkel;

public class MainBengkel {
    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan("K001", "Rian Hidayat", "Mekanik Utama");

        Pelanggan p1 = new Pelanggan("Andi Wijaya", "08112345436");
        Pelanggan p2 = new Pelanggan("Siti Rahma", "06789101112");

        Kendaraan mobil1 = new Kendaraan("P 8414 AB", "Toyota", "Avanza", "Mobil");
        Kendaraan mobil2 = new Kendaraan("B 9081 CD", "Honda", "HR-V", "Mobil");
        Kendaraan motor1 = new Kendaraan("N 4512 XY", "Yamaha", "NMAX", "Sepeda Motor");
        Kendaraan motor2 = new Kendaraan("L 3321 ZZ", "Honda", "Beat", "Sepeda Motor");

        p1.tambahKendaraan(mobil1);
        p1.tambahKendaraan(motor1);

        p2.tambahKendaraan(mobil2);
        p2.tambahKendaraan(motor2);

        Layanan servisBerkala = new Layanan("Servis Berkala", 150000);
        Layanan gantiOli = new Layanan("Ganti Oli Mesin", 80000);

        System.out.println();
        System.out.println("BENGKEL MAJU - NOTA SERVIS");
        System.out.println("Mekanik PJ : " + karyawan1.getNamaKaryawan() + " (" + karyawan1.getPosisi() + ")\n");

        System.out.println();

        System.out.println("PELANGGAN  : " + p1.getNama() + " (" + p1.getNoTelepon() + ")");
        System.out.println();
        karyawan1.prosesTransaksi(servisBerkala, mobil1);
        karyawan1.prosesTransaksi(gantiOli, motor1);

        System.out.println();
        System.out.println("PELANGGAN  : " + p2.getNama() + " (" + p2.getNoTelepon() + ")");
        System.out.println();
        karyawan1.prosesTransaksi(servisBerkala, mobil2);
        karyawan1.prosesTransaksi(gantiOli, motor2);

        System.out.println();
    }
}