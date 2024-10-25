import java.util.Scanner;
/**
 * RataNilai23
 */
public class RataNilai23 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int i, j;
        float nilai, totalNilai, rataNilai, nilaiMhs;

        i = 1;
        while (i <= 5) {
            totalNilai = 0; // Reset totalNilai untuk setiap set
            for (j = 1; j <= 5; j++) {
                System.out.print("nilai ke-" + j + " = ");
                nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai untuk set ke-" + i + ": " + rataNilai);
            i++;
        }
        sc.close();
    }
}