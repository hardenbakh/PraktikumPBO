package Jobsheet10.Kereta;

public abstract class KeretaKargo extends KeretaApi {
    private int kapasitasKargo;

    public KeretaKargo(String nomorKereta, String masinis, int kecepatanMax, int kapasitasKargo){
        super(nomorKereta, masinis, kecepatanMax);
        this.kapasitasKargo = kapasitasKargo;
    }

    public int getKapasitasKargo(){
        return kapasitasKargo;
    }

    public void setKapasitasKargo(int kapasitas){
        this.kapasitasKargo = kapasitas;
    }
}
