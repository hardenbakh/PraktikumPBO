package Jobsheet06;

import Jobsheet06.Dosen;

public class inheritanceDemo {
    
    public static void main(String[] args) {
        Dosen dosen2 = new Dosen("3452163517", "Yansy Ayuningtyas", 3000000, "4198247826478");
        Dosen dosen1 = new Dosen();

        dosen1.nama = "Yansy Ayuningtyas";
        dosen1.nip = "34329837";
        dosen1.gaji = 3000000;
        dosen1.nidn = "1987293063013";

        System.out.println(dosen1.getAllInfo());
    }
}
