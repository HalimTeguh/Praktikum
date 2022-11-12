package Project_UTS;

public class LimasSegi4 extends BangunRuang {
    double l, t;

    LimasSegi4(double s, double l, double t) {
        super(s);
        this.l = l;
        this.t = t;
    }

    public double hitungVolumeLimasSegi4() {
        return (s * l * t) / 3;
    }

    public double hitungLuasPermukaanLimasSegi4() {
        return (2 * (s * t)) + (2 * (l * t)) + (l * s);
    }

    public void tampilLimasSegi4() {
        System.out.println("Volume Limas Segi 4\t\t: " + hitungVolumeLimasSegi4());
        System.out.println("Luas Permukaan Limas Segi 4\t: " + hitungVolumeLimasSegi4());
    }

}
