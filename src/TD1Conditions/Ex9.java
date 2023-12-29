package TD1Conditions;
import  java.util.Scanner;
public class Ex9 {
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("a= ");
        int a=s.nextInt();
        System.out.print("b= ");
        int b=s.nextInt();
        if (a>b)
         {
             int k;
             k=a;
             a=b;
             b=k;
         }
        System.out.println("Les variables dans l'ordre croissant : "+a+","+b);

    }
}
