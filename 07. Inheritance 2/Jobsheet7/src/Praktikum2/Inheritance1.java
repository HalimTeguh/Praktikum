package Praktikum2;

public class Inheritance1 {
    public static void main(String[] args) {
        StaffTetap ST = new StaffTetap(
                "Halim", "Malang", "Laki-laki",
                20, 2000000, 250000,
                200000, "2A", 100000);
        ST.tampilStaffTetap();

        StaffHarian SH = new StaffHarian(
                "Teguh", "Bandung", "Laki-laki",
                25, 10000, 100000,
                50000, 100);
        SH.tampilStaffHarian();
    }
}
