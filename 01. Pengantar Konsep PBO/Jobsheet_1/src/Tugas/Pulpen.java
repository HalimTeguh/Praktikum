package Tugas;

public class Pulpen {
    private String merek;
    private String warna;
    private int status_tinta = 100;

    Pulpen(String merek, String warna) {
        this.merek = merek;
        this.warna = warna;
    }

    public void isiTinta() {
        if (status_tinta <= 0) {
            status_tinta = 100;
        }
    }

    public void menulis() {
        status_tinta -= 5;
    }

    public void cekStatus() {
        System.out.println("Nama Merek\t: " + merek);
        System.out.println("Warna Pulpen\t: " + warna);
        System.out.println("Status Tinta\t: " + status_tinta);
    }
}
