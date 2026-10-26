package Jobsheet08.Tugas;

abstract class Pesawat {
    private final String nomorEkor;
    private int kapasitasPenumpang;

    public Pesawat(String nomorEkor, int kapasitasPenumpang) {
        this.nomorEkor = nomorEkor;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public String getNomorEkor() {
        return nomorEkor;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public void setKapasitasPenumpang(int kapasitasPenumpang) {
        if (kapasitasPenumpang > 0) { // Validasi sederhana
            this.kapasitasPenumpang = kapasitasPenumpang;
        } else {
            System.out.println("Kapasitas penumpang harus lebih dari 0!");
        }
    }

    // abstract
    public abstract void takeOff();
    public abstract void landing();

    public void info() {
        System.out.println("Nomor Ekor          : " + getNomorEkor());
        System.out.println("Kapasitas Penumpang : " + getKapasitasPenumpang() + " orang");
    }
}