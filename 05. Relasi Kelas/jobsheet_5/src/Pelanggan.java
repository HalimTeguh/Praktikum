public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    Pelanggan() {

    }

    public Mobil getMobil() {
        return mobil;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public Sopir getSopir() {
        return sopir;
    }

    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) +
                sopir.hitungBiayaSopir(hari);
    }
}
