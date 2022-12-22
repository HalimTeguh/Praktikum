final class KomputerCetak {
    public static void main(String[] args) {
        Komputer[] data = new Komputer[3];
        data[0] = new PC();
        data[0].merek = "Asus";
        data[0].processor = "Intel Core I9";
        data[0].ram = 16;

        data[1] = new Laptop();
        data[1].merek = "Acer";
        data[1].processor = "AMD Ryzen R5";
        data[1].ram = 8;

        data[2] = new Netbook();
        data[2].merek = "Toshiba";
        data[2].processor = "Intel Celeron";
        data[2].ram = 4;

        KomputerCetak.cetak(data);
    }

    final static void cetak(Komputer[] obj) {
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] instanceof PC) {
                PC pc = (PC) obj[i];
                pc.hidupkan_os();
                pc.klik_Kanan();
                pc.klik_Kiri();
                pc.tekan_enter();
                pc.cetak_data();
                pc.matikan_os();
                System.out.println();
            } else if (obj[i] instanceof Laptop) {
                Laptop laptop = (Laptop) obj[i];
                laptop.hidupkan_os();
                laptop.klik_Kanan();
                laptop.klik_Kiri();
                laptop.tekan_enter();
                laptop.cetak_data();
                laptop.matikan_os();
                System.out.println();
            } else if (obj[i] instanceof Netbook) {
                Netbook netbook = (Netbook) obj[i];
                netbook.hidupkan_os();
                netbook.klik_Kanan();
                netbook.klik_Kiri();
                netbook.tekan_enter();
                netbook.cetak_data();
                netbook.matikan_os();
                System.out.println();
            }

        }
    }
}
