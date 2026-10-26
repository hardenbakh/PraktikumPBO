package Jobsheet08;

public class Lebah extends Hewan{
    public String kasta;

    public Lebah(String kasta, double berat, String makanan, String habitat){
        super(berat, makanan, habitat);
        this.kasta = kasta;
    }

    @Override
    public void bergerak() {
       System.out.println("mengepakkan sayap ke depan");
       System.out.println("memutar sayap hampir 90 derajat");
       System.out.println("mengepakan sayap ke belakang");
    }

    @Override
    public void bernafas() {
       System.out.println("otot, perut mengendur, udara masuk melalui lubang di segmen tubuh");
       System.out.println("Trakea mengirimkan oksigen");
       System.out.println("otot perut berkontraksi, udara dikeluarkan");
    }

    @Override
    public void cetakInfo() {
        // TODO Auto-generated method stub
        super.cetakInfo();
        System.out.println("Kasta   " + this.kasta);
    }
}
