package Jobsheet09;

public class PesawatKargo extends Pesawat{
 private double kapasitasMuatan;
 
 public PesawatKargo(final String nomorEkor, int kapasitasPenumpang, double kapasitasMuatan){
    super(nomorEkor, kapasitasPenumpang);
    this.kapasitasMuatan = kapasitasMuatan;
 }

 public double getKapasitasMuatan(){
    return kapasitasMuatan;
 }

 public void setKapasitasMuatan(double kapasitasMuatan){
    this.kapasitasMuatan = kapasitasMuatan;
 }

 @Override
 public void takeOff() {
     
 }

 @Override
 public void landing() {
     
 }

 @Override
 public void info() {
     
 }
}
