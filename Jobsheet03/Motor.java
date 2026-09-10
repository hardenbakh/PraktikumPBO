package Jobsheet03;

public class Motor {
    private  String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    public String getPlatNomor(){
        return platNomor;
    }

    public void setPlatNomor(String platNomor){
        this.platNomor = platNomor;
    }

    public boolean isIsMesinOn(){
        return isMesinOn;
    }

    public void setIsMesinOn(boolean isIsMesinOn) {
        this.isMesinOn = isIsMesinOn;
    }

    public int getKecepatan(){
        return kecepatan;
    }

    public void setKecepatan(int kecepatan){

        if (kecepatan > 100) {
            System.out.println("kecepatan maksimal adalah 100");
            
        }else if (!this.isMesinOn && kecepatan > 0) {
            System.out.println("kecepatan tidak boleh lebih dari 0 jika mesin off");

        } else {
            this.kecepatan = kecepatan;
        }
    }

    public void displayStatus(){
        System.out.println("Plat Nomor: " + this.platNomor);

        if (isMesinOn) {
            System.out.println("Mesin On");
        }
        else{
            System.out.println("Mesin Off");
        }

        System.out.println("Kecepatan:" + this.kecepatan);
        System.out.println("=========================");

    }
}