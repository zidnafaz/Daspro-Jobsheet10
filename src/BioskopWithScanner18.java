import java.util.Scanner;

public class BioskopWithScanner18 {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        int kolom, baris;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan Nama     : ");
            nama =input18.nextLine();
            System.out.print("Masukkan Baris    : ");
            baris =input18.nextInt();
            System.out.print("Masukkan Kolom    : ");
            kolom =input18.nextInt();
            input18.nextLine();

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input Penonton Lainnya? Y/N : ");
            next = input18.nextLine();

            if (next.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}
