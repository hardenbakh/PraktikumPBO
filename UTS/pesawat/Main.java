package UTS.pesawat;

public class Main {
    public static void main(String[] args) {
        System.out.println("-- pesawat kargo --");
        PesawatKargo kargo = new PesawatKargo("PK-B777F", 4, 102.0);
        kargo.displayInfoKargo();

        System.out.println("\n-- pesawat jet pribadi --");
        PesawatJetPribadi jet = new PesawatJetPribadi("PK-VIP88", 12, "Private Air", "Kabin Ruang Rapat & Sofa Kulit");
        jet.displayInfoJetPribadi();

        // Mengubah Nilai Atribut Menggunakan Setter (Enkapsulasi)
        System.out.println("\n-- SETELAH UPDATE ATRIBUT (SETTER) --");
        jet.setKapasitasPenumpang(16);
        jet.setFasilitasMewah("Kabin Ruang Rapat, Sofa Kulit & Kasur King Size");
        jet.displayInfoJetPribadi();
    }
}