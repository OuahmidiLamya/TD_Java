package TD1Boucles;
import java.util.Scanner;
public class Ex8 {
        public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
            System.out.print("Enter n : ");
            int n=s.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = n - 1; i > 0; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}


