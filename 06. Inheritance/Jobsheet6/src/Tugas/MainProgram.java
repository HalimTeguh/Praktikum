package Tugas;

public class MainProgram {
    public static void main(String[] args) {
        DaftarGaji data = new DaftarGaji(4);
        Dosen halim = new Dosen("001", "Halim", "Malang");
        halim.setSKS(5);

        Pegawai halim1 = new Pegawai("001", "Halim", "Malang");
        data.addPegawai(halim1);

        Dosen teguh = new Dosen("002", "Teguh", "Surabaya");
        teguh.setSKS(3);
        data.addPegawai(teguh);

        Dosen saputro = new Dosen("003", "Saputro", "Bandung");
        saputro.setSKS(8);
        data.addPegawai(saputro);

        data.printSemuaGaji();

    }
}
