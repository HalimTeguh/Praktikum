package Tugas;

public class MainProgram {
    public static void main(String[] args) {
        Mac mac = new Mac();
        mac.merk = "Macbook Pro 13 Inch";
        mac.kecProsesor = 2;
        mac.sizeMemory = 8;
        mac.jnsProsesor = "Intel Core i5";
        mac.jnsBatrei = "Lithium Polymer";
        mac.security = "Chip M2";
        mac.tampilMac();

        Windows windows = new Windows();
        windows.merk = "Asus A516";
        windows.kecProsesor = 1;
        windows.sizeMemory = 4;
        windows.jnsProsesor = "Intel Core i5-1035G1";
        windows.jnsBatrei = "2-cell Li-ion";
        windows.fitur = "Battery Health Charging";
        windows.tampilWindows();

        Pc pc = new Pc();
        pc.merk = "PC AMD Athlon 3000G";
        pc.kecProsesor = 4;
        pc.sizeMemory = 16;
        pc.jnsProsesor = "AMD Athlon";
        pc.ukuranMonitor = 14;
        pc.tampilPc();

    }
}
