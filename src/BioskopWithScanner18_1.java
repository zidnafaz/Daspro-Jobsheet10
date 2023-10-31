import java.util.Scanner;

public class BioskopWithScanner18_1 {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        int pilihan; // Menu
        String header = "========================================";

        int kolom, baris;
        String nama, next;

        String[][] penonton = new String[4][2];

        boolean mainMenu = true;
        while (mainMenu) {
            System.out.println(header);
            System.out.println("            BIOSKOP INDONESIA");
            System.out.println(header);
            System.out.println("                Main Menu");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.println("            Masukkan Pilihan");
            System.out.println(header);
            pilihan = input18.nextInt();

            switch (pilihan) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan Nama  : ");
                        nama = input18.next();
                        // input18.next();
                        System.out.print("Masukkan Baris : ");
                        baris = input18.nextInt();
                        System.out.print("Masukkan Kolom : ");
                        kolom = input18.nextInt();
                        input18.nextLine();

                        if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                            System.out.println(
                                    "Nomor baris atau kolom tidak tersedia. Silakan masukkan nomor yang valid.");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi telah ditempati. Silakan pilih kursi lain.");

                            System.out.print("Masukkan Baris Lain : ");
                            baris = input18.nextInt();
                            System.out.print("Masukkan Kolom Lain : ");
                            kolom = input18.nextInt();
                        }

                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi telah ditempati. Masukkan kembali nomor baris dan kolom.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Penempatan kursi berhasil");
                        }

                        System.out.print("Input Penonton Lainnya? Y/N : ");
                        next = input18.nextLine();

                        if (next.equalsIgnoreCase("N")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                penonton[i][j] = "***";
                            }
                        }
                        System.out.println("Penonton pada baris ke-" + (i + 1) + " : " + String.join(",", penonton[i]));
                    }
                    break;
                case 3:
                    System.out.println(header);
                    System.out.println("              TERIMA KASIH");
                    System.out.println(header);
                    mainMenu = false;
                    break;
                default:
                    System.out.println("Masukkan Pilihan Yang Benar");
                    break;
            }
        }

    }
}
