package TD3;
public class Ex3 {
    public static void main(String[] args) {
        Centre centre1 = new Centre(1, 2, 'A');
        centre1.affiche();
        Cercle cercle1 = new Cercle(3, 4, 'B', 5.0);
        cercle1.affiche();
    }
}
class Pt {
    protected int x, y;
    public Pt(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
    public void affiche() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
}

class Centre extends Pt {
    private char nom;
    public Centre(int x, int y, char nom) {
        super(x, y);
        this.nom = nom;
    }
    public void affNom() {
        System.out.println("Nom : " + nom);
    }
    @Override
    public void affiche() {
        super.affiche();
        affNom();
    }
}
class Cercle extends Centre {
    private double rayon;
    public Cercle(int x, int y, char nom, double rayon) {
        super(x, y, nom);
        this.rayon = rayon;
    }
    public double getRayon() {
        return rayon;
    }
    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Rayon : " + rayon);
    }
}
