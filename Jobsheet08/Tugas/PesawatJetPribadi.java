package Jobsheet08.Tugas;

class PesawatJetPribadi extends PesawatKomersial {
    private String fasilitasMewah;

    public PesawatJetPribadi(String nomorEkor, int kapasitasPenumpang, String maskapai, String fasilitasMewah) {
        super(nomorEkor, kapasitasPenumpang, maskapai);
        this.fasilitasMewah = fasilitasMewah;
    }

    public String getFasilitasMewah() {
        return fasilitasMewah;
    }

    public void setFasilitasMewah(String fasilitasMewah) {
        this.fasilitasMewah = fasilitasMewah;
    }

    // abstract
    @Override
    public void takeOff() {
        System.out.println("Jet Pribadi take-off secara efisien dari terminal VIP");
    }

    @Override
    public void landing() {
        System.out.println("Jet Pribadi mendarat dengan selamat dan langsung menuju terminal VIP");
        System.out.println();
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Fasilitas Mewah     : " + getFasilitasMewah());
    }
}