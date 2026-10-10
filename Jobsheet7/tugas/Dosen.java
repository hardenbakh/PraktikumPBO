package Jobsheet7.tugas;

public class Dosen extends Manusia {
    // OVERRIDING
    @Override
    public void makan() {
        System.out.println("Dosen makan di kantin dosen");
    }

    public void lembur() {
        System.out.println("Dosen lembur menyiapkan materi dan menilai tugas");
    }
}