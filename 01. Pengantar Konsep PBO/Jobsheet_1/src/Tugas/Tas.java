package Tugas;

public class Tas {
    private String merek;
    private String warna;
    private int jumlahStorage;

    Tas(String merek, String warna, int jumlah) {
        this.merek = merek;
        this.warna = warna;
        this.jumlahStorage = jumlah;
    }

    public void mengisi() {
        jumlahStorage -= 1;
    }

    public void ambilIsi() {
        jumlahStorage += 1;
    }

    public void cekStatus() {
        System.out.println("Nama Merek\t: " + merek);
        System.out.println("Warna Tas\t: " + warna);
        System.out.println("Jumlah Storage\t: " + jumlahStorage);
    }
}
