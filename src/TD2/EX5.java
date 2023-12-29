package TD2;
public class EX5 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(5, 8);
        System.out.println(rectangle2);
        Rectangle rectangle3 = new Rectangle(rectangle2);
        System.out.println(rectangle3);
        rectangle1.setLongueur(3);
        rectangle1.setLargeur(4);
        System.out.println(rectangle1.getLongueur());
        System.out.println(rectangle1.getLargeur());
        System.out.println("Périmètre: " + rectangle1.perimetre());
        System.out.println("Aire: " + rectangle1.aire());
        System.out.println("Le rectangle est un carré: " + rectangle1.isCarre());
    }
}
class Rectangle {
    private double longueur;
    private double largeur;
    public Rectangle() {
        this.longueur = 0;
        this.largeur = 0;
    }
    public Rectangle(double longueur, double largeur) {
        setLongueur(longueur);
        setLargeur(largeur);
    }
    public Rectangle(Rectangle rectangle) {
        this.longueur = rectangle.getLongueur();
        this.largeur = rectangle.getLargeur();
    }
    public double getLongueur() {
        return longueur;
    }
    public void setLongueur(double longueur) {
        if (longueur > 0) {
            this.longueur = longueur;
        } else {
            System.out.println("La longueur doit être positive.");
        }
    }
    public double getLargeur() {
        return largeur;
    }
    public void setLargeur(double largeur) {
        if (largeur > 0) {
            this.largeur = largeur;
        } else {
            System.out.println("La largeur doit être positive.");
        }
    }
    public double perimetre() {
        return 2 * (longueur + largeur);
    }
    public double aire() {
        return longueur * largeur;
    }
    public boolean isCarre() {
        return longueur == largeur;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "longueur=" + longueur + ", largeur=" + largeur + '}';
    }
}
