public class SepedaGunung extends Sepeda {
    private String tipeSuspensi;

    public void setTipeSuspensi(String value) {
        tipeSuspensi = value;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Tipe Suspensi\t: " + tipeSuspensi);
    }
}
