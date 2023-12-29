package TD1Boucles;
public class Ex10 {
        public static void main(String[] args) {
            for (int i = 100; i <=999; i++) {
                int a = i / 100;
                int b = (i % 100) / 10;
                int c = i % 10;
                int S = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
                if (S == i) {
                    System.out.println(i + " est un entier cubique.");
                }
            }
        }
}


