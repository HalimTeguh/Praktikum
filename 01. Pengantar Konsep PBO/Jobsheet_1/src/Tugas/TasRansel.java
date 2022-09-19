package Tugas;

public class TasRansel extends Tas {
    private Boolean tentengTas;

    TasRansel(String merek, String warna, int jumlah) {
        super(merek, warna, jumlah);
    }

    public void AngkatTas() {
        tentengTas = true;
    }

    public void TaruhTas() {
        tentengTas = false;
    }

    public void cekStatus() {
        super.cekStatus();
        System.out.println("Apakah tas ditenteng? " + tentengTas);
    }

}
