package TD1Tableaux;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print(" Entrez le nombre d'étudiants : ");
        int n= s.nextInt();
        double[] Moy=new double[n];
        for (int i = 0; i <n ; i++)
         {
             System.out.print(" Entrez la moyenne de l'étudiant " +(i+1)+ " : ");
             Moy[i]=s.nextDouble();
         }
        System.out.print(" Entrez le seuil de la moyenne : ");
        double seuil=s.nextDouble();
        int j=0;
        for (int i = 0; i <n ; i++)
         {
             if ( Moy[i]>= seuil )
              {
                j++;
              }
         }
        System.out.println(" Le nombre d'étudiants avec une moyenne supérieure ou égale au seuil est : " +j);
    }
}
