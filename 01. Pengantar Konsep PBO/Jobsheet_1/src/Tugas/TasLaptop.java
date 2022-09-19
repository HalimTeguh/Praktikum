package Tugas;

public class TasLaptop extends Tas {
    private Boolean isiLaptop;

    TasLaptop(String merek, String warna, int jumlah) {
        super(merek, warna, jumlah);
    }

    public void IsiLaptop() {
        isiLaptop = true;
    }

    public void ambilLaptop() {
        isiLaptop = false;
    }

    public void cekStatus() {
        super.cekStatus();
        System.out.println("Ada Laptop? " + isiLaptop);
    }

}
