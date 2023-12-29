package TD1Conditions;
import  java.util.Scanner;
public class Ex5 {
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Choisir une langue (F pour Français et A pour Anglais): ");
        char Langue=s.next().charAt(0);
        System.out.print("Enter l'heure (0-23): ");
        int H=s.nextInt();
        String message=" ";
        if(H>=0 && H<=18)
         {
            if (Langue=='F')
              {
                  System.out.println(message="Bonjour");
              }
            else if (Langue=='A')
              {
                  System.out.println(message="Good Morning");
              }
         }
        if(H>18 && H<=22)
         {
            if (Langue=='F')
            {
                System.out.println(message="Bonsoir");
            }
            else if (Langue=='A')
            {
                System.out.println(message="Good Evening");
            }
         }
        else if (H>22)
        {
            if (Langue=='F')
            {
                System.out.println(message="Bonne Nuit");
            }
            else if (Langue=='A')
            {
                System.out.println(message="Good Night");
            }
        }
    }
}
