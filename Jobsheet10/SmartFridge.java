package Jobsheet10;

public class SmartFridge extends Kulkas implements Audible{
    private int volume;

    public SmartFridge (int volume, int jumlahPintu, double harga, String warna, String merk){
        super(jumlahPintu, harga, warna, merk);
        this.volume = volume;
    }
    
    public int getVolume(){
    return volume;
    }

    public void setVolume(int volume){
    this.volume = volume;
    }

    @Override
    public void naikkanVolume(int increment) {
        volume += increment;
    }

    @Override
    public void turunkanVolume(int decrement) {
        volume += decrement;
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println("--- Informasi Smart Fridge ---");
        super.tampilkanInformasi();
        System.out.println("Volume Suara : " + volume);
    }

}
