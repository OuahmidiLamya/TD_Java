package TD1Boucles;
public class Ex6 {
        public static void main(String[] args) {
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    for (int k = 1; k <= 9; k++) {
                        if (i + j + k == 15) {
                            System.out.println(i + " + " + j + " + " + k + " = 15");
                        }
                    }
                }
            }
        }
}
