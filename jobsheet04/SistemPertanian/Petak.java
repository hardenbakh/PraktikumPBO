package jobsheet04.SistemPertanian;

public class Petak {
    private int nomorPetak;
    private double luasPetak;
    private boolean statusTanam;

    public Petak(int nomorPetak, double luasPetak) {
        this.nomorPetak = nomorPetak;
        this.luasPetak = luasPetak;
        this.statusTanam = false;
    }

    public int getNomorPetak() {
        return nomorPetak;
    }

    public void setNomorPetak(int nomorPetak) {
        this.nomorPetak = nomorPetak;
    }

    public double getLuasPetak() {
        return luasPetak;
    }

    public void setLuasPetak(double luasPetak) {
        this.luasPetak = luasPetak;
    }

    public boolean isStatusTanam() {
        return statusTanam;
    }

    public void setStatusTanam(boolean statusTanam) {
        this.statusTanam = statusTanam;
    }

    public void tanamBenih() {
        this.statusTanam = true;
        System.out.println("Petak nomor " + nomorPetak + " telah ditanami");
    }

    public void cekStatus() {
        String status = statusTanam ? "sudah ditanami" : "belum ditanami";
        System.out.println("Status petak " + nomorPetak + ": " + status);
    }

    public String getInfo() {
        String info = "";
        info += "Petak No. " + nomorPetak;
        info += ", Luas: " + luasPetak + " m2";
        info += ", Status: " + (statusTanam ? "sudah ditanami" : "belum ditanami");
        return info;
    }
}