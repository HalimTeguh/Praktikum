package Tugas;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected String alamat;

    Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getGaji() {
        return 100000;
    }
}
