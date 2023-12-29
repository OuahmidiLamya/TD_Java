package TD1Boucles;
import  java.util.Scanner;
public class Ex3Q1 {
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        for (int i=1;i<=20;i++)
         {
             System.out.print("Saisie le nombre # " +i+ " : ");
             int n=s.nextInt();
             if (n>max)
              {
                  max=n;
              }
         }
        System.out.println("Le max est : " +max);
    }
}
