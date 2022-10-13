public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    Gerbong() {
    }

    Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public Kursi[] getArrKursi() {
        return arrayKursi;
    }

    public void setArrKursi(Kursi[] arrKursi) {
        this.arrayKursi = arrKursi;
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        for (int i = nomor - 1; i < arrayKursi.length; i++) {
            if (this.arrayKursi[i].getPenumpang() == null) {
                this.arrayKursi[i].setPenumpang(penumpang);
                break;
            }
            nomor++;
        }
    }

}
