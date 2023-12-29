package TD1Boucles;
import java.util.Scanner;
public class Ex9 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Entrez un nombre entier : ");
            int n = s.nextInt();
            if (n < 0) {
                System.out.println("Veuillez entrer un nombre entier positif.");
                return;
            }
            int S= 0;
            int k= n;

            while (k != 0) {
                S += k % 10;
                k /= 10;
            }
            System.out.println("La somme des chiffres de " + n + " est : " + S);
        }
    }



