package TD1Conditions;
import  java.util.Scanner;
public class Ex1 {
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a= ");
        int a=s.nextInt();
        System.out.print("Enter b= ");
        int b=s.nextInt();
        System.out.print("Enter c= ");
        int c=s.nextInt();
        int max=Math.max(Math.max(a,b),c);
        System.out.print("Le max des trois nbrs est : "+max);
    }
}
