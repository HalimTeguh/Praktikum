package Project_UTS;

public class Lingkaran extends Bola {

    public Lingkaran(double r, double phi) {
        super(r, phi);
    }

    public double HitungKeliling() {
        return 2 * phi * r;
    }

    public double HitungLuas() {
        return phi * r * r;
    }

    public void tampilLingkaran() {
        System.out.println("Luas Lingkaran\t\t: " + HitungLuas());
        System.out.println("Keliling Lingkaran\t: " + HitungKeliling());
    }
}
