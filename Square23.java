import java.util.Scanner;
/**
 * Square23
 */
public class Square23 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai N = ");
        int N = sc.nextInt();
        for(int iOuter=1; iOuter<=N; iOuter++) {
        for(int i=1; i<=N; i++) {
            System.out.print("*");
        }
        System.out.println();
        }
    }
}