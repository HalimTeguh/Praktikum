package Tugas;

public class MainManusia {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        Dosen dosen = new Dosen();
        Mahasiswa mhs = new Mahasiswa();

        manusia.makan();
        manusia.Bernafas();
        System.out.println("");

        dosen.makan();
        dosen.lembur();
        System.out.println("");

        mhs.makan();
        mhs.Bernafas();
    }
}
