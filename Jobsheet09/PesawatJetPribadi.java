package Jobsheet09;

public class PesawatJetPribadi extends Pesawat{
    private String fasilitasMewah;

    public PesawatJetPribadi(final String nomorEkor, int kapasitasPenumpang, String fasilitasMewah){
        super(nomorEkor, kapasitasPenumpang);
        this.fasilitasMewah = fasilitasMewah;
    }

    public String getFasilitasMewah(){
        return fasilitasMewah;
    }

    public void setFasilitasMewah(String fasilitasMewah){
        this.fasilitasMewah = fasilitasMewah;
    }

    @Override
    public void takeOff() {
        
    }

    @Override
    public void landing() {
        
    }

    @Override
    public void info() {
        
    }
}
