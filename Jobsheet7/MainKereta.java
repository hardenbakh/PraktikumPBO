package Jobsheet7;

public class MainKereta {
    public static void main(String[] args) {
        Eksekutif eks = new Eksekutif("Taksaka", 500000, "KAI-EKS", "Selimut & Bantal Premium");
        eks.cetakNota(2); 

        System.out.println();

        Ekonomi eko = new Ekonomi("Matarmaja", 150000, "KAI-EKO", "2-2 Berhadapan");
        eko.cetakNota(3);

        System.out.println();

        Ekonomi eko1 = new Ekonomi(null, 0, null, null);
        eko1.cetakNota(0);
    }
}
