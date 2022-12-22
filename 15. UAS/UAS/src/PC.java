public class PC extends Komputer implements Mouse, Keyboard, Printer {

    @Override
    public void cetak_data() {
        // TODO Auto-generated method stub
        if (status == false) {
            System.out.println("Hidupkan PC terlebih Dahulu");
        } else {
            System.out.println("\nPC sedang mencetak sebuah Spesifikasi Perangkat");
            System.out.println("Merek PC\t\t: " + super.merek);
            System.out.println("Processor PC\t\t: " + super.processor);
            System.out.println("Ram PC\t\t\t: " + super.ram + "\n");
        }
    }

    @Override
    public void tekan_enter() {
        // TODO Auto-generated method stub
        if (status == false) {
            System.out.println("Hidupkan PC terlebih Dahulu");
        } else {
            System.out.println("PC sedang menekan Enter pada keyboard");
        }
    }

    @Override
    public void klik_Kanan() {
        // TODO Auto-generated method stub
        if (status == false) {
            System.out.println("Hidupkan PC terlebih Dahulu");
        } else {
            System.out.println("klik Kanan pada Mouse PC sedang tertekan");
        }
    }

    @Override
    public void klik_Kiri() {
        // TODO Auto-generated method stub
        if (status == false) {
            System.out.println("Hidupkan PC terlebih Dahulu");
        } else {
            System.out.println("klik Kiri pada Mouse PC sedang tertekan");
        }
    }

    @Override
    void hidupkan_os() {
        // TODO Auto-generated method stub
        if (status == false) {
            status = true;
            System.out.println("\n===MEMATIKAN PC ANDA===");
        } else {
            System.out.println("PC sudah Hidup");
        }
    }

    @Override
    void matikan_os() {
        // TODO Auto-generated method stub
        if (status == true) {
            status = false;
            System.out.println("===MEMATIKAN PC ANDA===\n");
        } else {
            System.out.println("PC sudah Mati");
        }
    }

}
