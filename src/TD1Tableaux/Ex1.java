package TD1Tableaux;

public class Ex1 {
    public static void main (String[] args)
    {
        int[] T= {5,10,3,8,15,2,7,9,22,45};
        int n=T.length;
        if (n<10 || n>50)
         {
             System.out.println(" La taille du tableau doit etre entre 10 et 50 ");
             return;
         }
        int max=T[0],min=T[0];
        for (int i = 1; i<n ; i++)
          {
             if (T[i]>max)
              {
                 max=T[i];
              }
             if (T[i]<min)
              {
                 min=T[i];
              }
          }
        System.out.println(" La valeur maximale de T est : " +max );
        System.out.println(" La valeur minimale de T est : " +min );
    }
}
