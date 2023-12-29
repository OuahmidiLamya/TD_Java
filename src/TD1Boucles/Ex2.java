package TD1Boucles;
import  java.util.Scanner;
public class Ex2 {
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("n= ");
        int n=s.nextInt();
        int S=0;
        for (int i=1;i<n;i+=2)
         {
            S+=i;
         }
        System.out.println("La somme des entiers impairs inférieurs à n est : "+S);
    }
}
