package TD1Tableaux;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print(" Entrez la taille des matrices carrées : ");
        int n= s.nextInt();
        double[][] M1=new double[n][n];
        double[][] M2=new double[n][n];
        double[][] MS=new double[n][n];
        System.out.println(" Saisir M1 : ");
        for (int i = 0; i <n ; i++)
         {
            for (int j = 0; j <n ; j++)
             {
                 System.out.print(" Entrez l'élément à la position [ " +(i+1)+ "][" +(j+1)+ "]:");
                 M1[i][j]=s.nextDouble();
             }
         }
        System.out.println(" Saisir M2 : ");
        for (int i = 0; i <n ; i++)
         {
            for (int j = 0; j <n ; j++)
            {
                System.out.print(" Entrez l'élément à la position [ " +(i+1)+ "][" +(j+1)+ "]:");
                M2[i][j]=s.nextDouble();
            }
         }
        System.out.println(" Saisir M1 : ");
        for (int i = 0; i <n ; i++)
         {
            for (int j = 0; j <n ; j++)
            {
               MS[i][j]=M1[i][j]+M2[i][j];
            }
         }
        System.out.println(" La somme des deux matrices est : ");
        for (int i = 0; i <n ; i++)
         {
            for (int j = 0; j <n ; j++)
            {
                System.out.println(MS[i][j]+ " ");
            }
         }
    }
}
