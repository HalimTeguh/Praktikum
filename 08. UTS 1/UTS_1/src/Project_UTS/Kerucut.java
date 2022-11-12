package Project_UTS;

public class Kerucut extends BangunRuang {
    double t;
    double s;

    Kerucut(double r, double phi, double t) {
        super(r, phi);
        this.t = t;
        this.s = s;
    }

    public double hitungVolume() {
        return (phi * r * r * t) / 3;
    }

    public double hitungLuasPermukaan() {
        return (phi * r * s) + (2 * phi * r * r);
    }

    public void tampilKerucut() {
        System.out.println("Volume Kerucut\t\t: " + hitungVolume());
        System.out.println("Luas Permukaan Kerucut\t: " + hitungLuasPermukaan());
    }
}
