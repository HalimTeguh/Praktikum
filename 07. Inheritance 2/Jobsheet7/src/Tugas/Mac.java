package Tugas;

public class Mac extends Laptop {
    public String security;

    public Mac() {

    }

    public Mac(
            String merk, int kecProsesor, int sizeMemory,
            String jnsProsesor, String jnsBatrei, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security = security;
    }

    public void tampilMac() {
        tampilLaptop();
        System.out.println("Security\t\t: " + security);
        System.out.println();
    }
}
