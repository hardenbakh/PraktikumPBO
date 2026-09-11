package Jobsheet03;


public class Smartphone {

    // ATRIBUT private 
    private String merek;
    private String warna;
    private int ram;
    private int penyimpanan;
    private boolean isOn; // atribut tambahan, dibutuhkan agar getTurnOnOrOff() punya nilai

    // CONSTRUCTOR

    // Constructor default (tanpa parameter)
    public Smartphone() {
        this.merek = "Tidak diketahui";
        this.warna = "Tidak diketahui";
        this.ram = 0;
        this.penyimpanan = 0;
    }

    // Constructor dengan parameter (overloading constructor)
    public Smartphone(String merek, String warna, int ram, int penyimpanan) {
        this.merek = merek;
        this.warna = warna;
        this.ram = ram;
        this.penyimpanan = penyimpanan;
    }

    // GETTER & SETTER (ENKAPSULASI)

    public String getMerek() {
        return merek;
    }

    public void setMerek(String newMerek) {
        this.merek = newMerek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String newWarna) {
        this.warna = newWarna;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int newRam) {
        if (newRam > 0) {
            this.ram = newRam;
        } else {
            System.out.println("RAM tidak valid!");
        }
    }

    public int getPenyimpanan() {
        return penyimpanan;
    }

    public void setPenyimpanan(int newPenyimpanan) {
        if (newPenyimpanan > 0) {
            this.penyimpanan = newPenyimpanan;
        } else {
            System.out.println("Penyimpanan tidak valid!");
        }
    }

    // Getter untuk status on/off
    public boolean getTurnOnOrOff() {
        return isOn;
    }

    // Setter untuk status on/off (pasangan get-set, konsisten dengan atribut lain)
    public void setTurnOnOrOff(boolean status) {
        this.isOn = status;
    }

    // METHOD

    public void ambilFoto() {
        if (isOn) {
            System.out.println(merek + " berhasil mengambil foto.");
        } else {
            System.out.println("Nyalakan smartphone terlebih dahulu untuk mengambil foto.");
        }
    }

    public void kirimPesan() {
        if (isOn) {
            System.out.println(merek + " berhasil mengirim pesan.");
        } else {
            System.out.println("Nyalakan smartphone terlebih dahulu untuk mengirim pesan.");
        }
    }

    public void tampilkanInfo() {
        System.out.println("INFORMASI SMARTPHONE");
        System.out.println("Merek       : " + merek);
        System.out.println("Warna       : " + warna);
        System.out.println("RAM         : " + ram + " GB");
        System.out.println("Penyimpanan : " + penyimpanan + " GB");
        System.out.println("Status      : " + (isOn ? "Menyala" : "Mati"));
        System.out.println();
    }
}