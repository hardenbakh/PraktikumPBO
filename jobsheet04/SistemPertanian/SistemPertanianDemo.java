package jobsheet04.SistemPertanian;

public class SistemPertanianDemo {
    public static void main(String[] args) {
        System.out.println("--- SISTEM MANAJEMEN PERTANIAN ---");
        System.out.println();

        Petani petani1 = new Petani("Pak Budi", 12);
        Lahan lahanSawah = new Lahan(5000.0, "Desa Sukamaju", "Sawah Padi");

        Petak petak1 = new Petak(1, 2500.0);
        Petak petak2 = new Petak(2, 2500.0);

        lahanSawah.tambahPetak(petak1);
        lahanSawah.tambahPetak(petak2);

        petani1.tambahLahan(lahanSawah);

        // Aktivitas
        System.out.println("--- Aktivitas ---");
        petani1.tanam();
        petak1.tanamBenih(); // Mengubah status petak1 menjadi 'sudah ditanami'
        System.out.println();

        System.out.println("--- info lahan dan petani ---");
        System.out.print(petani1.getInfo());

        Petani petani2 = new Petani("Satrio", 1);
        System.out.println(petani2.getInfo());
    }
}
