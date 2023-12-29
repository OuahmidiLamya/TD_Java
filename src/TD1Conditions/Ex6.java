package TD1Conditions;
import  java.util.Scanner;
public class Ex6 {
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("La valeur de a: ");
        int a=s.nextInt();
        System.out.print("La valeur de b: ");
        int b=s.nextInt();
        if (a==0 || b==0)
         {
             System.out.println("Le produit est nul");
         }
        if ((a<0 && b<0)||(a>0 && b>0))
         {
            System.out.println("Le produit est positif");
         }
        else
         {
             System.out.println("Le produit est négatif");
         }
    }
}
