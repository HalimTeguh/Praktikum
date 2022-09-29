public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        System.out.println();

        mhs2.nim = 102;
        mhs2.nama = "Halim";
        mhs2.alamat = "Jl. Gitar No 3A";
        mhs2.kelas = "3A";
        mhs2.tampilBiodata();

        System.out.println();

        mhs3.nim = 103;
        mhs3.nama = "Teguh";
        mhs3.alamat = "Jl. Piano No 3A";
        mhs3.kelas = "3A";
        mhs3.tampilBiodata();
    }
}
