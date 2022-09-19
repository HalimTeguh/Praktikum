package Tugas;

public class Kertas {
    private String merek;
    private String warna;
    private int jumlahKertas = 10;

    Kertas(String merek, String warna) {
        this.merek = merek;
        this.warna = warna;
    }

    public void melipat() {
        jumlahKertas -= 1;
    }

    public void merobek() {
        jumlahKertas -= 1;
    }

    public void cekStatus() {
        System.out.println("Nama Merek\t: " + merek);
        System.out.println("Warna Kertas\t: " + warna);
        System.out.println("Jumlah Kertas\t: " + jumlahKertas);
    }
}
