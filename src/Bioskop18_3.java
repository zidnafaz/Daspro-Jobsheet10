public class Bioskop18_3 {
    public static void main(String[] args) {

        String[][] penonton = new String[4][2];

        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        // Pertanyaan 10
        System.out.println("penonton pada baris ke-3 : ");

        for (int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
        }

        // Pertanyaan 11
        System.out.println("penonton pada baris ke-3 : ");

        for (String i : penonton[2]) {
            System.out.println(i);
        }

        // Pertanyaan 12
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i+1) + " : " + String.join(",", penonton[i]));
        }

    }
}