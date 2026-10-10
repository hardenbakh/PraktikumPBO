package Jobsheet7.tugas;

public class Mahasiswa extends Manusia {
    // OVERRIDING
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan di kantin kampus");
    }

    public void tidur() {
        System.out.println("Mahasiswa tidur setelah mengerjakan tugas");
    }
}