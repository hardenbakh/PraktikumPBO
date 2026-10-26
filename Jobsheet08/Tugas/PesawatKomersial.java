package Jobsheet08.Tugas;

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

    // override untuk abstract
    @Override
    public void takeOff() {
        System.out.println("Pesawat Komersial " + getMaskapai() + " melakukan prosedur take-off standar bandara internasional.");
    }

    @Override
    public void landing() {
        System.out.println("Pesawat Komersial " + getMaskapai() + " mendarat dan menuju terminal penumpang.");
        System.out.println();
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Maskapai            : " + getMaskapai());
    }

}