package Praktikum1;

public class Inheritance1 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.nama = "Halim";
        m.alamat = "Jl.Vinolia";
        m.umur = 25;
        m.jk = "Laki-laki";
        m.gaji = 3000000;
        m.tunjangan = 1000000;
        m.tampilDataManager();

        Staff s = new Staff();
        s.nama = "Teguh";
        s.alamat = "Malang";
        s.umur = 20;
        s.jk = "Laki-laki";
        s.gaji = 2000000;
        s.lembur = 500000;
        s.potongan = 250000;
        s.tampilDataStaff();
    }
}
