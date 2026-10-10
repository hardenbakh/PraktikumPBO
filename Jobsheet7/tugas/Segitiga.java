package Jobsheet7.tugas;

public class Segitiga {
    private int sudut;

    public int getSudut() {
        return sudut;
    }

    public void setSudut(int sudut) {
        this.sudut = sudut;
    }

    // OVERLOADING totalSudut: sudut = 180 - sudutA
    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    // OVERLOADING totalSudut: sudut = 180 - (sudutA + sudutB)
    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    // OVERLOADING keliling: keliling = sisiA + sisiB + sisiC
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // OVERLOADING keliling (segitiga siku-siku):
    // sisi miring c = akar(a^2 + b^2), keliling = a + b + c
    public double keliling(int sisiA, int sisiB) {
        double c = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return sisiA + sisiB + c;
    }

    public static void main(String[] args) {
        Segitiga s = new Segitiga();

        System.out.println("=== Total Sudut ===");
        System.out.println("Sudut A = 60          -> sudut lainnya = " + s.totalSudut(60));
        System.out.println("Sudut A = 60, B = 50  -> sudut lainnya = " + s.totalSudut(60, 50));

        System.out.println("=== Keliling ===");
        System.out.println("Sisi 7, 8, 9          -> keliling = " + s.keliling(7, 8, 9));
        System.out.println("Siku-siku, sisi 3 & 4 -> keliling = " + s.keliling(3, 4));
        double c = Math.sqrt(3 * 3 + 4 * 4);
        System.out.println("Sisi miring c (3,4)   = " + c);
    }
}