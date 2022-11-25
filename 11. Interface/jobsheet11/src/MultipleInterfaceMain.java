import interfaceLatihan.PascaSarjana;
import interfaceLatihan.Rektor;
import interfaceLatihan.Sarjana;

public class MultipleInterfaceMain {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        Sarjana sarjanaCum = new Sarjana("Halim");
        PascaSarjana masterCum = new PascaSarjana("Teguh");

        pakRektor.beriSertifikatMawapres(sarjanaCum);
        pakRektor.beriSertifikatMawapres(masterCum);
    }
}
