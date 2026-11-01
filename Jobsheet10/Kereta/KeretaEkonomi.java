package Jobsheet10.Kereta;

public abstract class KeretaEkonomi extends KeretaApi {
    private int jumlahPenumpang;

    public KeretaEkonomi(String nomorKereta, String masinis, int kecepatanMax, int jumlahPenumpang){
        super(nomorKereta, masinis, kecepatanMax);
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public int getJumlahPenumpang(){
        return jumlahPenumpang;
    }

    public void setJumlahPenumpang(int penumpang){
        this.jumlahPenumpang = penumpang;
    }
}
