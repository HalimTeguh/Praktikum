package Project_UTS;

public class Persegi extends Kubus {

    Persegi(double s) {
        super(s);
    }

    public double hitungLuasPersegi() {
        return s * s;
    }

    public double hitungKelilingPersegi() {
        return 4 * s;
    }

    public void tampilPersegi() {
        System.out.println("Luas Persegi\t\t: " + hitungLuasPersegi());
        System.out.println("Keliling Persegi\t: " + hitungKelilingPersegi());
    }
}
