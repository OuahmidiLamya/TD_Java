package TD1Conditions;
import  java.util.Scanner;
public class Ex8 {
    public static void main (String[] args)
     {
         Scanner s=new Scanner(System.in);
         System.out.print("Entrez le numéro du mois (1-12): ");
         int mois=s.nextInt();
         if (mois<1 || mois>12)
          {
              System.out.println("Le numéro du mois n'est pas valide entrer un nombre entre 1 et 12");
          }
         else
          {
              System.out.print("Entrez l'année (1900-2100): ");
              int annee=s.nextInt();
              if (annee<1900 || annee>2100)
               {
                   System.out.println("L'année n'est pas valide.Veuillez entrer une année entre 1900 et 2100");
               }
              else
               {
                   int nbrJour=0;
                   switch (mois)
                      {
                             case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                                nbrJour=31;
                             break;
                             case 4: case 6: case 9: case 11:
                                 nbrJour=30;
                             break;
                             case 2:
                                 if ((annee%4==0 && annee%100!=0)||(annee%400==0))
                                  {
                                      nbrJour=29;
                                  }
                                 else
                                  {
                                     nbrJour=28;
                                  }
                             break;
                      }
                   System.out.println(" Le mois " +mois+ " de l'année " +annee+ " a " +nbrJour+ " jours ");
               }
          }
     }
}
