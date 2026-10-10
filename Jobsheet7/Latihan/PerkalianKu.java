package Jobsheet7.Latihan;

public class PerkalianKu {
    // OVERLOADING: parameter bertipe int
    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    // OVERLOADING: parameter bertipe double
    void perkalian(double a, double b) {
        System.out.println(a * b);
    }

    public static void main(String args[]) {
        PerkalianKu objek = new PerkalianKu();
        objek.perkalian(25, 43);
        objek.perkalian(34.56, 23.7);
    }
}