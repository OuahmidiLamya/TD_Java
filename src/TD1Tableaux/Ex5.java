package TD1Tableaux;
public class Ex5 {
    public static void main(String[] args)
    {
        String[] T={"D","E","C","A","L","A","G","E"};
        int n=T.length;
        String k=T[0];
        for (int i = 0; i<n ; i++)
         {
            T[i]=T[i+1];
         }
        T[n-1]=k;
        for (String Element:T)
         {
             System.out.println(Element+ " ");
         }
    }
}
