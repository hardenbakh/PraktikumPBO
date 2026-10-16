package UTS.pesawat;

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

    public void displayInfoJetPribadi() {
        displayInfoKomersial();
        System.out.println("Fasilitas Mewah     : " + getFasilitasMewah());
    }
}