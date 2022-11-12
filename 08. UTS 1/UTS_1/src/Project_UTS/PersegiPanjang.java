package Project_UTS;

public class PersegiPanjang extends LimasSegi4 {
    PersegiPanjang(double s, double l, double t) {
        super(s, l, t);
    }

    public double hitungLuasPersegiPanjang() {
        return s * t;
    }

    public double hitungKelilingPersegiPanjang() {
        return (2 * (s + t));
    }

    public void tampilPersegiPanjang() {
        System.out.println("Luas Persegi\t\t: " + hitungLuasPersegiPanjang());
        System.out.println("Keliling Persegi\t: " + hitungKelilingPersegiPanjang());
    }
}
