package TD2;


public class Ex1 {
    public static void main(String[] args) {
        Point pointA = new Point('A', 5.0);
        System.out.println("Avant la translation :");
        pointA.affiche();
        pointA.translate(2.5);
        System.out.println("Après la translation :");
        pointA.affiche();
    }
}
class Point{
    private char nom;
    private double abscisse;
    public Point(char nom, double abscisse)
       {
        this.nom = nom;
        this.abscisse = abscisse;
       }
    public void affiche()
       {
        System.out.println("Point " + nom + " : Abscisse = " + abscisse);
       }
    public void translate(double translation)
         {
             abscisse += translation;
         }
}


