package Project_UTS;

public class Bola extends BangunRuang {

    Bola(double r, double phi) {
        super(r, phi);
    }

    public double hitungVolume() {
        return 4 / 3 * phi * r * r * r;
    }

    public double hitungLuasPermukaan() {
        return 4 * phi * r * r;
    }

    public void tampilBola() {
        System.out.println("Volume Bola\t\t: " + hitungVolume());
        System.out.println("Luas Permukaan Bola\t: " + hitungLuasPermukaan());
    }

}
