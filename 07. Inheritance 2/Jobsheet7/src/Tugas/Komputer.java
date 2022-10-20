package Tugas;

public class Komputer {
    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;

    public Komputer() {

    }

    public Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }

    public void tampilData() {
        System.out.println("Merek\t\t\t: " + merk);
        System.out.println("Kecepatan Prosesor\t: " + kecProsesor);
        System.out.println("Size Memory\t\t: " + sizeMemory);
        System.out.println("Jenis Prosesor\t\t: " + jnsProsesor);
    }
}
