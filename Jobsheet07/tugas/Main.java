package Jobsheet07.tugas;

public class Main {
    public static void main(String[] args) {
        // Dynamic method dispatch: reference bertipe superclass,
        // objek bertipe subclass. Method yang dipanggil ditentukan saat runtime.
        Manusia m;

        m = new Manusia();
        System.out.println("-- m = new Manusia() --");
        m.bernafas();
        m.makan();

        m = new Dosen();
        System.out.println("-- m = new Dosen() --");
        m.bernafas();      // diwarisi dari Manusia
        m.makan();         // versi Dosen
        ((Dosen) m).lembur();

        m = new Mahasiswa();
        System.out.println("-- m = new Mahasiswa() --");
        m.bernafas();      // diwarisi dari Manusia
        m.makan();         // versi Mahasiswa
        ((Mahasiswa) m).tidur();

        // Dynamic dispatch pada array bertipe Manusia
        System.out.println("-- array Manusia[] --");
        Manusia[] daftar = { new Manusia(), new Dosen(), new Mahasiswa() };
        for (Manusia x : daftar) {
            x.makan();
        }
    }
}