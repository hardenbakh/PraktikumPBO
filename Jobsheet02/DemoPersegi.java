package Jobsheet02;

public class DemoPersegi {
 
    public static void main(String[] args) {
        PersegiPanjang p1 = new PersegiPanjang();
        p1.panjang = 8;
        p1.lebar= 5;

        p1.displayInfo();
        p1.getLuas();
        p1.getKeliling();
    }


}
