public class MainPertanyaan {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarpants");
        // Pegawai asisten = new Pegawai("1234", "Halim");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);

        System.out.println(keretaApi.info());
    }
}
