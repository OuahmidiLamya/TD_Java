package TD3;
public class Ex2 {
    public static void main(String[] args) {
        PointNom pointNom = new PointNom(1, 2, 'A');
        pointNom.affCoordNom();
        pointNom.deplace(3, 4);
        pointNom.affCoordNom();
        pointNom.setNom('B');
        pointNom.affCoordNom();
    }
}
class PPoint {
    protected int x, y;
    public PPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }
    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
}
class PointNom extends PPoint {
    private char nom;
    public PointNom(int x, int y, char nom) {
        super(x, y);
        this.nom = nom;
    }
    public void setPointNom(int x, int y, char nom) {
        this.x = x;
        this.y = y;
        this.nom = nom;
    }
    public void setNom(char nom) {
        this.nom = nom;
    }
    public void affCoordNom() {
        System.out.println("Coordonnees : " + x + " " + y + " Nom : " + nom);
    }
}

