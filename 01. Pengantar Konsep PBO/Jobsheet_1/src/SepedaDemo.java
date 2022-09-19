public class SepedaDemo {
    public static void main(String[] args) {
        System.out.println("Nama\t: Halim Teguh Saputro");
        System.out.println("Kelas\t: SIB 2E");
        System.out.println("NIM\t: 2141762122\n\n");

        // buat dua buat objek sepeda
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        SepedaGunung spd3 = new SepedaGunung();

        spd1.setMerek("Polygone");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();

        System.out.println();

        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();

        System.out.println();

        spd3.setMerek("Kline");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setTipeSuspensi("Gas Suspension");
        spd3.cetakStatus();

    }
}
