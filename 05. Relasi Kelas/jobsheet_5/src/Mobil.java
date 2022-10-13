public class Mobil {
    private String merk;
    private int biaya;

    Mobil() {

    }

    Mobil(String merk, int biaya) {
        this.merk = merk;
        this.biaya = biaya;
    }

    public String getMerk() {
        return merk;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }

}
