package TD1Boucles;
import  java.util.Scanner;
public class Ex5 {
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n;
        int un=1;
        int un1=1;
        int un2=1;
        System.out.print(" Enter n= ");
        n=s.nextInt();
        if (n==0 || n==1)
         {
             System.out.println(1);
             return;
         }
        System.out.println("1 1");
        for (int i=2;i<=n;i++)
         {
            un=un1+un2;
            un2=un1;
            un1=un;
             System.out.println(un+ " ");
         }
    }
}
