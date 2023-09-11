import java.util.Scanner;

public class Penilaian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama");
        String nama = input.nextLine();
        System.out.println("Masukkan Nilai Anda");
        double nilai = input.nextDouble();

        if (nilai >= 96 && nilai <= 100) {
            System.out.println("Predikat = A");
            System.out.println("Kriteria = Sangat Baik ");
        } else if (nilai > 90 && nilai < 96) {
            System.out.println("A-");
            System.out.println("Sangat Baik");
        } else if (nilai > 85 && nilai < 91) {
            System.out.println("B+");
            System.out.println("Baik");
        } else if (nilai > 80 && nilai < 86) {
            System.out.println("B");
            System.out.println("Baik");
        } else if (nilai > 74 && nilai < 81) {
            System.out.println("Predikat = B-");
            System.out.println("Kriteria = Baik");
        } else if (nilai > 69 && nilai < 75) {
            System.out.println("Predikat = C+");
            System.out.println("Kriteria = Cukup");
        } else if (nilai > 64 && nilai < 70) {
            System.out.println("C");
            System.out.println("Cukup");
        } else if (nilai > 59 && nilai < 65) {
            System.out.println("C-");
            System.out.println("Cukup");
        } else if (nilai > 54 && nilai < 60) {
            System.out.println("D");
            System.out.println("Kurang");
        } else if (nilai > 0 && nilai < 55) {
            System.out.println("D");
            System.out.println("Kurang");
        }

    }

}
