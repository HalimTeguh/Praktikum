package Project_UTS;

public class Kubus extends BangunRuang {

    Kubus(double s) {
        super(s);
    }

    public double hitungVolumeKubus() {
        return s * s * s;
    }

    public double hitungLuasPermukaanKubus() {
        return 6 * s * s;
    }

    public void tampilKubus() {
        System.out.println("Volume Kubus\t\t: " + hitungVolumeKubus());
        System.out.println("Luas Permukaan Kubus\t: " + hitungLuasPermukaanKubus());
    }
}
