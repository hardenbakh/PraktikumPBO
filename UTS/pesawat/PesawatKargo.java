package UTS.pesawat;

class PesawatKargo extends Pesawat {
    private double kapasitasMuatan;

    public PesawatKargo(String nomorEkor, int kapasitasPenumpang, double kapasitasMuatan) {
        super(nomorEkor, kapasitasPenumpang);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public double getKapasitasMuatan() {
        return kapasitasMuatan;
    }

    public void setKapasitasMuatan(double kapasitasMuatan) {
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public void displayInfoKargo() {
        displayInfoPesawat();
        System.out.println("Kapasitas Muatan    : " + getKapasitasMuatan() + " Ton");
    }
}