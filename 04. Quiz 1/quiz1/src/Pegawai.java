public class Pegawai {
    private String nama;
    private String nip;
    private double gajiPokok, lembur, uangMakan, transport;
    private int jumlahJamKerja;
    private double totalGaji;

    Pegawai(String nama, String nip, int jamKerja) {
        this.nama = nama;
        this.nip = nip;
        this.jumlahJamKerja = jamKerja;
    }

    public void setJamKerja(int jam) {
        this.jumlahJamKerja = jam;
    }

    public String getNama() {
        return nama;
    }

    public String getNIP() {
        return nip;
    }

    public int getJamKerja() {
        return jumlahJamKerja;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getLembur() {
        return lembur;
    }

    public double getUangMakan() {
        return uangMakan;
    }

    public double getTransport() {
        return transport;
    }

    public void hitungGajiHarian() {
        int jamLembur = jumlahJamKerja - 7;
        if (jumlahJamKerja >= 9) {
            transport = 4000;
            uangMakan = 3500;
            gajiPokok = 2000 * 7;
            lembur = jamLembur * (2000 * 1.5);
        } else if (jumlahJamKerja >= 8) {
            uangMakan = 3500;
            gajiPokok = 2000 * 7;
            lembur = jamLembur * (2000 * 1.5);
        } else if (jumlahJamKerja > 7) {
            gajiPokok = 2000 * 7;
            lembur = jamLembur * (2000 * 1.5);
        } else {
            jumlahJamKerja = jumlahJamKerja * 2000;
        }

        totalGaji = gajiPokok + lembur + uangMakan + transport;
    }

    public void cetakPenghasilan() {
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("NIP\t\t\t: " + nip + "\n");
        System.out.println("Jumlah Jam Kerja\t: " + jumlahJamKerja);
        System.out.println("Gaji Pokok\t\t: " + gajiPokok);
        System.out.println("Uang Lembur\t\t: " + lembur);
        System.out.println("Uang Makan\t\t: " + uangMakan);
        System.out.println("Uang Transport\t\t: " + transport);
        System.out.println("Total Penghasilan\t: " + totalGaji);

    }
}
