package Jobsheet06.Tugas;

public class MainKereta {
    public static void main(String[] args) {

        System.out.println("EKSEKUTIF TANPA PARAMETER");
        KeretaEksekutif gajayanaDefault = new KeretaEksekutif();
        gajayanaDefault.displayInfo();

        System.out.println("\nEKSEKUTIF TANPA PARAMETER (modifikasi)");
        KeretaEksekutif gajayana = new KeretaEksekutif();
        
        // Modifikasi atribut tanpa parameter
        gajayana.setKodeKereta("KA-20");
        gajayana.setNamaKereta("Gajahwong");
        gajayana.setKapasitasKursi(48);
        gajayana.setHargaTiketDasar(650000);
        gajayana.setFasilitasLegrest(true);
        gajayana.setLayananMakanGratis(false);
        
        gajayana.displayInfo();


        System.out.println("\nEKSEKUTIF BERPARAMETER");
        KeretaEksekutif argoBromo = new KeretaEksekutif("KA-01", "Argo Bromo Anggrek", 50, 750000, true, true);
        argoBromo.displayInfo();

        System.out.println("\nEKONOMI BERPARAMETER");
        KeretaEkonomi tawangAlun = new KeretaEkonomi("KA-02", "Tawang Alun", 106, 120000, "2-2 Berhadapan", true);
        tawangAlun.displayInfo();
    }
}