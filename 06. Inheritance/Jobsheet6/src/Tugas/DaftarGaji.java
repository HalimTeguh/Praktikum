package Tugas;

public class DaftarGaji {
    private Pegawai[] listPegawai;

    DaftarGaji(int jmlPegawai) {
        listPegawai = new Pegawai[jmlPegawai];
    }

    public void addPegawai(Pegawai pegawai) {
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] == null) {
                this.listPegawai[i] = pegawai;
                break;
            }
        }
    }

    public void printSemuaGaji() {
        int i = 0;
        while (listPegawai[i] != null && i < listPegawai.length) {
            System.out.println("NIP\t: " + listPegawai[i].getNip());
            System.out.println("Nama\t: " + listPegawai[i].getNama());
            System.out.println("Alamat\t: " + listPegawai[i].getAlamat());
            System.out.println("Gaji\t: " + listPegawai[i].getGaji());
            System.out.println();
            i++;
        }
    }
}
