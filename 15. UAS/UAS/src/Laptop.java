public class Laptop extends Komputer implements Mouse, Keyboard, Printer {

    @Override
    public void cetak_data() {
        // TODO Auto-generated method stub
        if (status == false) {
            System.out.println("Hidupkan Laptop terlebih Dahulu");
        } else {
            System.out.println("\nLaptop sedang mencetak sebuah Spesifikasi perangkat");
            System.out.println("Merek Laptop\t\t: " + super.merek);
            System.out.println("Processor Laptop\t: " + super.processor);
            System.out.println("Ram Laptop\t\t: " + super.ram + "\n");
        }
    }

    @Override
    public void tekan_enter() {
        // TODO Auto-generated method stub
        if (status == false) {
            System.out.println("Hidupkan Laptop terlebih Dahulu");
        } else {
            System.out.println("Laptop sedang menekan Enter pada keyboard");
        }
    }

    @Override
    public void klik_Kanan() {
        // TODO Auto-generated method stub
        if (this.status == false) {
            System.out.println("Hidupkan Laptop terlebih Dahulu");
        } else {
            System.out.println("klik Kanan pada Mouse Laptop sedang tertekan");
        }
    }

    @Override
    public void klik_Kiri() {
        // TODO Auto-generated method stub
        if (status == false) {
            System.out.println("Hidupkan Laptop terlebih Dahulu");
        } else {
            System.out.println("klik Kiri pada Mouse Laptop sedang tertekan");
        }
    }

    @Override
    void hidupkan_os() {
        // TODO Auto-generated method stub
        if (this.status == false) {
            this.status = true;
            System.out.println("\n===MENGHIDUPKAN LAPTOP ANDA===");
        } else {
            System.out.println("Laptop sudah Hidup");
        }
    }

    @Override
    void matikan_os() {
        // TODO Auto-generated method stub
        if (this.status == true) {
            this.status = false;
            System.out.println("===MEMATIKAN LAPTOP ANDA===\n");
        } else {
            System.out.println("Laptop sudah Mati");
        }
    }

}
