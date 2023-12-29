package TD1Boucles;
import  java.util.Scanner;
public class Ex3Q3 {
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int pos=0,j=1,n;
        do
         {
             System.out.print(" n= ");
              n=s.nextInt();
             if (n>max)
               {
                 max=n;
                 pos=j;
               }
             j++;
         } while (n!=0);
        System.out.println("Max= " +max+ " Pos= " +pos);
    }
}
