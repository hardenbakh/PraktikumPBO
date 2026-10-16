package UTS.pesawat;

class Pesawat {
    private String nomorEkor;
    private int kapasitasPenumpang;

    public Pesawat(String nomorEkor, int kapasitasPenumpang) {
        this.nomorEkor = nomorEkor;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public String getNomorEkor() {
        return nomorEkor;
    }

    public void setNomorEkor(String nomorEkor) {
        this.nomorEkor = nomorEkor;
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

    public void displayInfoPesawat() {
        System.out.println("Nomor Ekor          : " + getNomorEkor());
        System.out.println("Kapasitas Penumpang : " + getKapasitasPenumpang() + " orang");
    }
}