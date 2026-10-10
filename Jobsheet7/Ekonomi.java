package Jobsheet7;

public class Ekonomi extends KeretaApi{
    private String penataan;

    public Ekonomi(String nama, double harga, String kodeOperator, String penataan){
        super(nama, harga, kodeOperator);
        this.penataan = penataan;
    }

    public String getPenataan(){
        return penataan;
    }

    @Override
    public double hitungHarga() {
        // TODO Auto-generated method stub
        return super.hitungHarga() * 0.8;
    }

    @Override
    public void displayInfo() {
        // TODO Auto-generated method stub
        super.displayInfo();
    }
}
