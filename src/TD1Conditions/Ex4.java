package TD1Conditions;
import  java.util.Scanner;
public class Ex4 {
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Donner la moyenne de l'étudiant : ");
        double moy=s.nextDouble();
        if (moy>=16)
         {System.out.println("Mention: Très Bien");}
        else if (moy>=14)
         {System.out.println("Mention: Bien");}
        else if (moy>=12)
         {System.out.println("Mention: Assez Bien");}
        else if (moy>=10)
         {System.out.println("Mention: Passable");}
        else
         {System.out.println("Mention: Insuffisant");}
    }
}
