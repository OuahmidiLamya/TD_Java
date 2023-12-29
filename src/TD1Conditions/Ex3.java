package TD1Conditions;
import  java.util.Scanner;
public class Ex3 {
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Donner la valeur de a : ");
        int a=s.nextInt();
        System.out.print("Donner la valeur de b : ");
        int b=s.nextInt();
        System.out.println("Choisissez une option : ");
        System.out.println("Vérifier si la somme a+b est paire");
        System.out.println("Vérifier si le produit a*b est pair");
        System.out.println("Connaitre le signe de la somme a+b");
        System.out.println("Connaitre le signe du produit a*b");
        System.out.print("Entrez votre choix :");
        int choix=s.nextInt();
        switch (choix)
        {
            case 1:boolean SommePaire;
                SommePaire=(a+b)%2==0;
            System.out.println("La somme a+b est paire: "+SommePaire);
            break;
            case 2:boolean ProdPair;
                ProdPair=(a*b)%2==0;
            System.out.println("Le produit a*b est pair: "+ProdPair);
            break;
            case 3:int S=a+b;
            if (S>0)
             {
                System.out.println("La somme est positive ");
             }
            else if (S<0)
             {
                 System.out.println("La somme est négative ");
             }
            else
             {
                 System.out.println("La somme est nulle");
             }
            break;
            case 4:int P=a*b;
            if (P>0)
             {
                System.out.println("Le produit est positif ");
             }
            else if (P<0)
             {
                System.out.println("Le produit est négatif ");
             }
            else
             {
                System.out.println("Le produit est nul");
             }
            break;
            default:
             System.out.println("Choix non valide");
        }
    }
}
