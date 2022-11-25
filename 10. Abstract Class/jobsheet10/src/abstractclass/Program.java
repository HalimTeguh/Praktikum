package abstractclass;

public class Program {
    public static void main(String[] args) {
        Kucing kucingKampung = new Kucing();
        Ikan lumbaLumba = new Ikan();

        Orang halim = new Orang("Halim");
        Orang teguh = new Orang("Teguh");

        halim.peliharaHewan(kucingKampung);
        teguh.peliharaHewan(lumbaLumba);

        halim.ajakPeliharaanJalanJalan();
        teguh.ajakPeliharaanJalanJalan();
    }
}
