package TD3;
public class Ex6 {
    public static void main(String[] args) {
        Disque disque1 = new Disque();
        Disque disque2 = new Disque(new Point(3, 4), 2.5, "MonDisque");
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5, 8, "MonRectangle");
        System.out.println(disque1);
        System.out.println("Périmètre du disque1: " + disque1.getPerimeter());
        System.out.println("Aire du disque1: " + disque1.getArea());
        System.out.println(disque2);
        System.out.println("Périmètre du disque2: " + disque2.getPerimeter());
        System.out.println("Aire du disque2: " + disque2.getArea());
        System.out.println(rectangle1);
        System.out.println("Périmètre du rectangle1: " + rectangle1.getPerimeter());
        System.out.println("Aire du rectangle1: " + rectangle1.getArea());
        System.out.println(rectangle2);
        System.out.println("Périmètre du rectangle2: " + rectangle2.getPerimeter());
        System.out.println("Aire du rectangle2: " + rectangle2.getArea());
    }
}
abstract class Figure {
    protected String nom;
    public Figure() {
        this.nom = "Figure";
    }
    public Figure(String nom) {
        this.nom = nom;
    }
    public abstract double getPerimeter();
    public abstract double getArea();
    @Override
    public String toString() {
        return "Figure [nom=" + nom + "]";
    }
}
class Disque extends Figure {
    private Point centre;
    private double rayon;
    public Disque() {
        super();
        this.centre = new Point(0, 0);
        this.rayon = 1.0;
    }
    public Disque(Point centre, double rayon) {
        super();
        this.centre = centre;
        this.rayon = rayon;
    }
    public Disque(Point centre, double rayon, String nom) {
        super(nom);
        this.centre = centre;
        this.rayon = rayon;
    }
    public double getPerimeter() {
        return 2 * Math.PI * rayon;
    }
    public double getArea() {
        return Math.PI * Math.pow(rayon, 2);
    }
    @Override
    public String toString() {
        return "Disque [nom=" + nom + ", centre=" + centre + ", rayon=" + rayon + "]";
    }
}
class Rectangle extends Figure {
    private double longueur;
    private double largeur;
    public Rectangle() {
        super();
        this.longueur = 1.0;
        this.largeur = 1.0;
    }
    public Rectangle(double longueur, double largeur) {
        super();
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public Rectangle(double longueur, double largeur, String nom) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public double getPerimeter() {
        return 2 * (longueur + largeur);
    }
    public double getArea() {
        return longueur * largeur;
    }
    @Override
    public String toString() {
        return "Rectangle [nom=" + nom + ", longueur=" + longueur + ", largeur=" + largeur + "]";
    }
}
 //Une classe Point pour représenter les coordonnées du centre du disque.
class Pointt {
    private double x;
    private double y;
    public Pointt(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}




