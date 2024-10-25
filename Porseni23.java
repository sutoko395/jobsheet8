import java.util.Scanner;
/**
 * Porseni23
 */
public class Porseni23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah cabang olahraga: ");
        int jumlahCabang = scanner.nextInt();

        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        String[][] atlet = new String[jumlahCabang][5];

        for (int i = 0; i < jumlahCabang; i++) {
            System.out.println("Cabang Olahraga: " + cabangOlahraga[i]);
            for (int j = 0; j < 5; j++) {
                System.out.print("Masukkan nama atlet ke-" + (j + 1) + ": ");
                atlet[i][j] = scanner.next();
            }
        }

        System.out.println("\nInformasi Atlet Porseni:");
        for (int i = 0; i < jumlahCabang; i++) {
            System.out.println("Cabang Olahraga: " + cabangOlahraga[i]);
            for (int j = 0; j < 5; j++) {
                System.out.println("Atlet ke-" + (j + 1) + ": " + atlet[i][j]);
            }
        }
    }
}