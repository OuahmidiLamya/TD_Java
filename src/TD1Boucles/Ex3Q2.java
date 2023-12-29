package TD1Boucles;
import  java.util.Scanner;
public class Ex3Q2 {
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int pos=0;
        for (int i=1;i<=20;i++)
        {
            System.out.print("Saisie le nombre # " +i+ " : ");
            int n=s.nextInt();
            if (n>max)
             {
                 max=n;
                 pos=i;
             }
        }
        System.out.println("Max= " +max+ " Pos= " +pos);
    }
}
