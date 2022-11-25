import interfaceLatihan.Mahasiswa;
import interfaceLatihan.PascaSarjana;
import interfaceLatihan.Rektor;
import interfaceLatihan.Sarjana;

public class interfaceMain {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        Mahasiswa mhsBiasa = new Mahasiswa("Halim");
        Sarjana sarjanaCumlaude = new Sarjana("Teguh");
        PascaSarjana masterCumlaude = new PascaSarjana("Saputro");

        // pakRektor.beriSertifikatCumlaude(mhsBiasa);
        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakRektor.beriSertifikatCumlaude(masterCumlaude);

    }
}
