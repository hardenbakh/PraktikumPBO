package Jobsheet10.Kereta;

public abstract class KeretaApi {
    private String nomorKereta;
    private String masinis;
    private int kecepatanMax;
    
    public KeretaApi(String nomorKereta, String masinis, int kecepatanMax){
        this.nomorKereta = nomorKereta;
        this.masinis = masinis;
        this.kecepatanMax = kecepatanMax;
    }

    public String getNoKereta(){
        return nomorKereta;
    }

    public String getMasinis(){
        return masinis;
    }

    public int getKecepatan(){
        return kecepatanMax;
    }

    public void setNoKereta(String nomorKereta){
        this.nomorKereta = nomorKereta;
    }

    public void setMasinis(String masinis){
        this.masinis = masinis;
    }

    public void setKecepatanMax(int kecepatanMax){
        this.kecepatanMax = kecepatanMax;
    }


    public abstract double hitungTarif(int jarakKM);

    public abstract void cetakInformasi();
}
