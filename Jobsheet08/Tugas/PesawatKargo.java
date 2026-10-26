package Jobsheet08.Tugas;

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

    //abstract
    @Override
    public void takeOff() {
        System.out.println("Pesawat Kargo take-off membutuhkan dorongan mesin ekstra karena membawa muatan " + getKapasitasMuatan() + " Ton.");
    }

    @Override
    public void landing() {
        System.out.println("Pesawat Kargo mendarat dan langsung mengarah ke area apron logistik/kargo.");
        System.out.println();
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Kapasitas Muatan    : " + getKapasitasMuatan() + " Ton");
    }
}