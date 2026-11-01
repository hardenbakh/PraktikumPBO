package Jobsheet10.Kereta;

public abstract class KeretaEkspres extends KeretaApi {
    private int jumlahGerbong;

    public KeretaEkspres(String nomorKereta, String masinis, int kecepatanMax, int jumlahGerbong){
        super(nomorKereta, masinis, kecepatanMax);
        this.jumlahGerbong = jumlahGerbong;
    }

    public int getJumlahGerbong(){
        return jumlahGerbong;
    }

    public void setJumlahGerb0ng (int jumlahGerbong){
        this.jumlahGerbong = jumlahGerbong;
    }
}
