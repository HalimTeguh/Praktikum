package Project_UTS;

public class MainProject {
    public static void main(String[] args) {
        System.out.println("Nama\t: Halim Teguh Saputro");
        System.out.println("Kelas\t: SIB 2E");
        System.out.println("NIM\t: 2141762122");

        Lingkaran lingkaran1 = new Lingkaran(7, 3.14);
        Persegi persegi = new Persegi(5);
        PersegiPanjang persegiPanjang = new PersegiPanjang(3, 2, 5);
        Segitiga segitiga = new Segitiga(10, 15, 12);
        Kerucut kerucut = new Kerucut(7, 3.14, 7);

        System.out.println("===LINGKARAN===");
        lingkaran1.tampilLingkaran();
        System.out.println("\n===BOLA===");
        lingkaran1.tampilBola();

        System.out.println("\n===PERSEGI===");
        persegi.tampilPersegi();
        System.out.println("\n===KUBUS===");
        persegi.tampilKubus();

        System.out.println("\n===PERSEGI PANJANG===");
        persegiPanjang.tampilPersegiPanjang();
        System.out.println("\n===LIMAS SEGI 4===");
        persegiPanjang.tampilLimasSegi4();

        System.out.println("\n===SEGITIGA===");
        segitiga.tampilSegitiga();
        System.out.println("\n===LIMAS SEGI 3===");
        segitiga.tampilLimasSegi3();

        System.out.println("\n===KERUCUT===");
        kerucut.tampilKerucut();

    }
}
