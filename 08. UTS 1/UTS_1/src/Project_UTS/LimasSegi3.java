package Project_UTS;

public class LimasSegi3 extends BangunRuang {
    double ta, T;

    LimasSegi3(double s, double ta, double T) {
        super(s);
        this.ta = ta;
        this.T = T;
    }

    public double hitungVolumeLimasSegi3() {
        return (s * ta * T) / 6;
    }

    public double hitungLuasPermukaanLimasSegi3() {
        return (ta * s) + (2 * (s * T));
    }

    public void tampilLimasSegi3() {
        System.out.println("Volume Limas Segi 3\t\t: " + hitungVolumeLimasSegi3());
        System.out.println("Luas Permukaan Limas Segi 3\t: " + hitungLuasPermukaanLimasSegi3());
    }

}
