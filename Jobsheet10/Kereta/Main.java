package Jobsheet10.Kereta;

public class Main {
    public static void main(String[] args) {

        // Kereta Ekspress KA Malioboro Express
        MalioboroExpress malioboro = new MalioboroExpress("KA-101", "Budi Santoso", 120, 8, 1500.0);
        malioboro.cetakInformasi();
        System.out.println("Total Tarif (140 km) : Rp " + malioboro.hitungTarif(140));
        malioboro.aktifkanListrik();
        malioboro.maju();
        malioboro.berhenti();

        System.out.println();

        // Kereta Kargo : KA Peti kemas
        PetiKemas kargo = new PetiKemas("KA-202", "Joko Widodo", 90, 50, 40.5);
        kargo.cetakInformasi();
        System.out.printf("Total Tarif Kargo (100 km) : Rp %.2f\n", kargo.hitungTarif(100));
        kargo.maju();

        System.out.println();

        // kereta ekonomi : KA Dhoho
        Dhoho dhoho = new Dhoho("KA-303", "Siti Aminah", 90, 450);
        dhoho.cetakInformasi();
        dhoho.aktifkanRem();
        dhoho.berhenti();
    }
}