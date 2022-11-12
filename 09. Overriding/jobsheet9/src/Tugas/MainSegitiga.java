package Tugas;

import java.util.Scanner;

public class MainSegitiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Segitiga data = new Segitiga();

        System.out.print("Masukkan sudut A: ");
        int sudutA = sc.nextInt();
        System.out.print("Masukkan sudut B: ");
        int sudutB = sc.nextInt();
        System.out.println("");
        System.out.println("Hasil Method 1 : " + data.totalSudut(sudutA));
        System.out.println("Hasil Method 2 : " + data.totalSudut(sudutA, sudutB));

        System.out.println("");
        System.out.println("");

        System.out.print("Masukkan sisi A: ");
        int sisiA = sc.nextInt();
        System.out.print("Masukkan sisi B: ");
        int sisiB = sc.nextInt();
        System.out.print("Masukkan sisi C: ");
        int sisiC = sc.nextInt();
        System.out.println("");

        System.out.println("Hasil Method 3 : " + data.keliling(sisiA, sisiB, sisiC));
        data.keliling(sisiA, sisiB, sisiC);
        System.out.println("Hasil Method 4 : " + data.keliling(sisiA, sisiB));

    }

}
