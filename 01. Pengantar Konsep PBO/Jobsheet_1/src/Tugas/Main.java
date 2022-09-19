package Tugas;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nama\t: Halim Teguh Saputro");
        System.out.println("Kelas\t: SIB 2E");
        System.out.println("NIM\t: 2141762122\n");

        Pulpen pulpenSimbalion = new Pulpen("Simbalion", "Hitam");
        Kertas kertasBoss = new Kertas("Boss", "Putih");
        TasLaptop tasAcer = new TasLaptop("Acer", "Hitam", 10);
        TasRansel tasEiger = new TasRansel("Eiger", "Abu-Abu", 4);

        pulpenSimbalion.menulis();
        pulpenSimbalion.menulis();
        pulpenSimbalion.menulis();
        pulpenSimbalion.cekStatus();

        System.out.println();

        kertasBoss.melipat();
        kertasBoss.merobek();
        kertasBoss.cekStatus();

        System.out.println();

        tasAcer.mengisi();
        tasAcer.mengisi();
        tasAcer.mengisi();
        tasAcer.ambilIsi();
        tasAcer.IsiLaptop();
        tasAcer.cekStatus();

        System.out.println();

        tasEiger.mengisi();
        tasEiger.mengisi();
        tasEiger.ambilIsi();
        tasEiger.AngkatTas();
        tasEiger.cekStatus();

    }
}
