package TD1Tableaux;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un entier N : ");
        int N = scanner.nextInt();
        if (N < 0) {
            System.out.println("Veuillez entrer un entier positif.");
            return;
        }
        int n = 32;
        int[] Bin= new int[n];
        int i = n- 1;
        while (N > 0 && i >= 0) {
            Bin[i] = N % 2;
            N = N / 2;
            i--;
        }
        System.out.print("La représentation binaire est : ");
        for (int j = i + 1; j < n; j++) {
            System.out.print(Bin[j]);
        }
    }
}
