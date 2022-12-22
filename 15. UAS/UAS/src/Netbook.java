public class Netbook extends Komputer implements Mouse, Keyboard, Printer {

    @Override
    public void cetak_data() {
        // TODO Auto-generated method stub
        if (status == false) {
            System.out.println("Hidupkan NetBook terlebih Dahulu");
        } else {
            System.out.println("\nNetBook sedang mencetak sebuah Spesifikasi perangkat");
            System.out.println("Merek NetBook\t\t: " + super.merek);
            System.out.println("Processor NetBook\t: " + super.processor);
            System.out.println("Ram NetBook\t\t: " + super.ram + "\n");
        }
    }

    @Override
    public void tekan_enter() {
        // TODO Auto-generated method stub
        if (status == false) {
            System.out.println("Hidupkan NetBook terlebih Dahulu");
        } else {
            System.out.println("NetBook sedang menekan Enter pada keyboard");
        }
    }

    @Override
    public void klik_Kanan() {
        // TODO Auto-generated method stub
        if (status == false) {
            System.out.println("Hidupkan NetBook terlebih Dahulu");
        } else {
            System.out.println("klik Kanan pada Mouse NetBook sedang tertekan");
        }
    }

    @Override
    public void klik_Kiri() {
        // TODO Auto-generated method stub
        if (status == false) {
            System.out.println("Hidupkan NetBook terlebih Dahulu");
        } else {
            System.out.println("klik Kiri pada Mouse NetBook sedang tertekan");
        }
    }

    @Override
    void hidupkan_os() {
        // TODO Auto-generated method stub
        if (status == false) {
            status = true;
            System.out.println("===MENGHIDUPKAN NETBOOK ANDA===");
        } else {
            System.out.println("NetBook sudah Hidup");
        }
    }

    @Override
    void matikan_os() {
        // TODO Auto-generated method stub
        if (status == true) {
            System.out.println("\n===MEMATIKAN NETBOOK ANDA===");
            status = false;
        } else {
            System.out.println("NetBook sudah Mati");
        }
    }

}
