package Jobsheet08.Tugas;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        PesawatKargo kargo = new PesawatKargo("PK-B777F", 4, 102.0);
        kargo.info();
        kargo.takeOff();
        kargo.landing();

        System.out.println();
        PesawatJetPribadi jet = new PesawatJetPribadi("PK-VIP88", 12, "Private Air", "Kabin Ruang Rapat & Sofa Kulit");
        jet.info();
        jet.takeOff();
        jet.landing();
    }
}