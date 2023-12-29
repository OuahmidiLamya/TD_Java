package TD1Boucles;
import  java.util.Scanner;
public class Ex4 {
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("a= ");
        int a=s.nextInt();
        System.out.print("b= ");
        int b=s.nextInt();
        while (b!=0)
         {
           int r=a%b;
           a=b;
           b=r;
         }
        System.out.println("Le PGCD est : " +a);
    }
}

