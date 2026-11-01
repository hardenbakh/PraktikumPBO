package Jobsheet09;

public class PesawatKomersial extends Pesawat{
    private String maskapai;

    public PesawatKomersial(final String nomorEkor, int kapasitasPenumpang, String maskapai){
        super(nomorEkor, kapasitasPenumpang);
        this.maskapai = maskapai;
    }

    public String getMaskapai(){
        return maskapai;
    }

    public void setMaskapai(){
        this.maskapai = maskapai;
    }

    @Override
    public void takeOff() {
        
    }

    @Override
    public void landing() {
        
    }

    @Override
    public void info() {
        super.info();
    }
    
}
