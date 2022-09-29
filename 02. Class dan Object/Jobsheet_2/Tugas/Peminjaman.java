public class Peminjaman {
    public String id;
    public String namaMember;
    public String namaGame;
    public int harga;

    public void pinjam(int lama) {
        System.out.println("Id Peminjaman\t: " + id);
        System.out.println("Nama Member\t: " + namaMember);
        System.out.println("Nama Game\t: " + namaGame);

        lama *= harga;

        System.out.println("Harga\t\t: " + lama);
    }
}
