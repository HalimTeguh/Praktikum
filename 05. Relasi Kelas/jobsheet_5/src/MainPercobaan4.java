public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p1 = new Penumpang("1234", "Mr. Krab");
        Penumpang budi = new Penumpang("4567", "budi");

        Gerbong gerbong = new Gerbong("A", 10);

        gerbong.setPenumpang(p1, 1);
        gerbong.setPenumpang(budi, 1);

        System.out.println(gerbong.info());

    }
}
