public class MainPeminjaman {
    public static void main(String[] args) {
        Peminjaman pjm1 = new Peminjaman();
        pjm1.id = "001";
        pjm1.namaMember = "Halim";
        pjm1.namaGame = "Minecraft";
        pjm1.harga = 10000;
        pjm1.pinjam(2);
    }
}
