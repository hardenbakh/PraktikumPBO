package Jobsheet7;

public class Eksekutif extends KeretaApi {
    private String fasilitasTambahan;

    public Eksekutif() {
    super("null", 0, "KAI"); 
    this.fasilitasTambahan = "Standar";             
}

    public Eksekutif(String nama, double harga, String kodeOperator, String fasilitasTambahan ){
        super(nama, harga, kodeOperator);
        this.fasilitasTambahan = fasilitasTambahan;
    }

    public String getFasilitasTambahan(){
        return fasilitasTambahan;
    } 

    public void setFasilitas(String fasilitasTambahan){
        this.fasilitasTambahan = fasilitasTambahan;
    }

    @Override
    public double hitungHarga() {
        // TODO Auto-generated method stub
        return super.hitungHarga() + 20000;
    }

    @Override
    public void displayInfo() {
        // TODO Auto-generated method stub
        super.displayInfo();
        System.out.println("fasilitas   : " + fasilitasTambahan);
    }
}
