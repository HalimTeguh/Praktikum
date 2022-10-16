package Tugas;

public class Dosen extends Pegawai {
    private int jumlahSKS;
    private int tarifSKS = 100000;

    Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
        super.nip = nip;
        super.nama = nama;
        super.alamat = alamat;
    }

    public void setSKS(int sks) {
        this.jumlahSKS = sks;
    }

    public int getGaji() {
        return tarifSKS * jumlahSKS;
    }
}
