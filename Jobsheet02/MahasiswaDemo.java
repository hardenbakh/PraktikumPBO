package Jobsheet02;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa();
        Mahasiswa m3 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        m2.nim = "029883";
        m2.nama = "ABHI";
        m2.alamat = "Jerapa, Jawa Tengah";
        m2.kelas = "2H";

        m3.nim = "023453";
        m3.nama = "Nicoo";
        m3.alamat = "Sawojajar, Jawa Timur";
        m3.kelas = "2F";

        m1.displayBiodata();
        m2.displayBiodata();
        m3.displayBiodata();   
    }
    
}