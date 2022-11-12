package Project_UTS;

public class Segitiga extends LimasSegi3 {
    double t;

    Segitiga(double s, double ta, double T) {
        super(s, ta, T);
        this.ta = ta;
        this.T = T;

    }

    public double hitungLuasSegitiga() {
        return (s * ta) / 2;
    }

    public double hitungKelilingSegitiga() {
        return s + ta + T;
    }

    public void tampilSegitiga() {
        System.out.println("Luas Segitiga\t\t: " + hitungLuasSegitiga());
        System.out.println("Keliling Segitiga\t: " + hitungKelilingSegitiga());
    }
}
