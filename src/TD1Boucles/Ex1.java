package TD1Boucles;
import  java.util.Scanner;
public class Ex1 {
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("n= ");
        int n=s.nextInt();
        int F=1;
        if(n<0)
         {
             System.out.println("Le factoriel n'est pas défini que pour les entiers naturels positifs");
         }
        else
         {
            for (int i=1;i<=n;i++)
             {
                 F*=i;
             }
             System.out.println(n+"!= "+F);
         }
    }
}
