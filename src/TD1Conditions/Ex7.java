package TD1Conditions;
import  java.util.Scanner;
public class Ex7 {
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print(" Entrer un entier de trois chiffres non nuls : ");
        int n=s.nextInt();
        if (n<100 || n>999)
         {
             System.out.println("L'entier doit avoir trois chiffres non nuls ");
             return;
         }
        int a=n/100;
        int b=(n/10)%10;
        int c=n%10;
        System.out.println("Les nombres formés par les chiffres de n sont : ");
        System.out.println(" "+a+b+c);
        System.out.println(" "+a+c+b);
        System.out.println(" "+b+a+c);
        System.out.println(" "+b+c+a);
        System.out.println(" "+c+a+b);
        System.out.println(" "+c+b+a);
    }
}
