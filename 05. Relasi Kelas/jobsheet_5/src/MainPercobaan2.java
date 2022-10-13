public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setMerk("Avanza");
        m.setBiaya(350000);

        Sopir s = new Sopir();
        s.setNama("Halim");
        s.setBiaya(200000);

        Pelanggan p = new Pelanggan();
        p.setNama("Teguh");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);

        System.out.println("Biaya Total = " +
                p.hitungBiayaTotal());

        System.out.println(p.getMobil().getMerk());
    }
}
