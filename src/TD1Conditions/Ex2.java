package TD1Conditions;
import  java.util.Scanner;
public class Ex2 {
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Donner la valeur de a : ");
        double a=s.nextDouble();
        System.out.print("Donner la valeur de b : ");
        double b=s.nextDouble();
        System.out.print("Donner la valeur de c : ");
        double c=s.nextDouble();
        double d=b*b-4*a*c;
        if(d>0)
         {
            double x1=(-b+Math.sqrt(d))/(2*a);
            double x2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Les solutions de l'équation sont : x1= "+x1+ " et x2= "+x2);
         }
        else if (d==0)
         {
            double x=-b/(2*a);
             System.out.println("L'équation a une solution x= "+x);
         }
        else
         {
             System.out.println("L'éqution n'a pas de solution réelle");
         }
    }
}
