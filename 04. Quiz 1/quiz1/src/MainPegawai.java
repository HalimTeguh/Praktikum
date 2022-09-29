public class MainPegawai {
    public static void main(String[] args) {
        Pegawai pgw1 = new Pegawai("Anto", "001", 10);
        Pegawai pgw2 = new Pegawai("Bagus", "002", 8);

        pgw1.hitungGajiHarian();
        pgw1.cetakPenghasilan();

        System.out.println("\n========================================\n");

        pgw2.hitungGajiHarian();
        pgw2.cetakPenghasilan();
    }
}
