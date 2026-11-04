package Praktikum10;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("19940201", "Widia, S.kom. M.kom", "199402");
        TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md", "Tenaga Adminitrasi");

        train(dosen1);
        train(tendik1);
        Pegawai pegawai1 = dosen1;

    }

    public static void train(Pegawai pegawai){
        pegawai.displayInfo();
        System.out.println("Mengenalkan lingkungan kampus");
        System.out.println("Menginfokan SOP/Juknis");

        if (pegawai instanceof Dosen) {
            System.out.println("Memberikan pelatihan pedagogik");
        }
    }
    

}


        // System.out.println(pegawai1.nip);
        // System.out.println(pegawai1.nama);
        // pegawai1.displayInfo();

        // Dosen newDosen = (Dosen) pegawai1;

        // System.out.println(newDosen.nama);
        // System.out.println(newDosen.nidn);
        // newDosen.mengajar();

        
        // TenagaKependidikan test = (TenagaKependidikan) pegawai1;

        // Dosen dosen2 = new Dosen("19970015", "Muhammad, S.T, M.T", "197001");
        // TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md", "TenagaAdminitrasi");
        // TenagaKependidikan tendik2 = new TenagaKependidikan("19650304", "Rika, S.T.", "Tenaga Laboratorium");

        // ArrayList<Pegawai> daftarPegawai = new ArrayList<Pegawai>();
        // daftarPegawai.add(dosen1);
        // daftarPegawai.add(dosen2);
        // daftarPegawai.add(tendik1);
        // daftarPegawai.add(tendik2); 

        // System.out.println("Jumlah Pegawai : " + daftarPegawai.size());