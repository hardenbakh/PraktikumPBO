package Jobsheet02;

public class PersegiPanjang {
    int panjang, lebar;

    public void displayInfo(){
        System.out.println("Panjang :" + panjang);
        System.out.println("lebar   :" + lebar);
    }

    public int getLuas(){
        int luas;
        luas = panjang * lebar;
        System.out.println("luas Persegi                :" + luas);
        return luas;
    }

    public int getKeliling(){
        int keliling;
        keliling = 2 * panjang * lebar;
        System.out.println("keliling persegi panjang    :" + keliling);
        return keliling;
    }
}
