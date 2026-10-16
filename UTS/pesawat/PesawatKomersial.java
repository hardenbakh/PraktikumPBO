package UTS.pesawat;

class PesawatKomersial extends Pesawat {
    private String maskapai;

    public PesawatKomersial(String nomorEkor, int kapasitasPenumpang, String maskapai) {
        super(nomorEkor, kapasitasPenumpang);
        this.maskapai = maskapai;
    }

    public String getMaskapai() {
        return maskapai;
    }

    public void setMaskapai(String maskapai) {
        this.maskapai = maskapai;
    }

    public void displayInfoKomersial() {
        displayInfoPesawat();
        System.out.println("Maskapai            : " + getMaskapai());
    }
}