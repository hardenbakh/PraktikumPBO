package Jobsheet09;

abstract class Pesawat {
    private final String nomorEkor;
    private int kapasitasPenumpang;

    public Pesawat(String nomorEkor, int kapasitasPenumpang) {
        this.nomorEkor = nomorEkor;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    //abstract
    public abstract void takeOff();
    public abstract void landing();

    public String getNomorEkor(){
        return nomorEkor;
    }

    public int getKapasitasPenumpang(){
        return kapasitasPenumpang;
    }

    public void setKapasitasPenumpang(int kapasitasPenumpang){
        if (kapasitasPenumpang > 0) {
        this.kapasitasPenumpang = kapasitasPenumpang;    
        } else {
            System.out.println("kapasitas penumpang harus lebih dari 0");
        }
    }

    public void info(){
        System.out.println("nomor ekor  : " + getNomorEkor());
        System.out.println("kapasitas   : " + getKapasitasPenumpang());
    }
}
