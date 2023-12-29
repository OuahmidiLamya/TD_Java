package TD3;
public class Ex4 {
    public static void main(String[] args) {
        Batiment batiment = new Batiment("123 Rue de la Ville");
        System.out.println("Bâtiment :");
        System.out.println(batiment.toString());
        System.out.println();
        Maison maison = new Maison("456 Avenue du Quartier", 3);
        System.out.println("Maison :");
        System.out.println(maison.toString());
        System.out.println();
        Immeuble immeuble = new Immeuble("789 Boulevard de la Cité", 10);
        System.out.println("Immeuble :");
        System.out.println(immeuble.toString());
    }
}
class Batiment {
    private String adresse;
    public Batiment() {}
    public Batiment(String adresse) {
        this.adresse = adresse;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String toString() {
        return "Adresse du bâtiment : " + adresse;
    }
}
class Maison extends Batiment {
    private int nbChambres;
    public Maison() {}
    public Maison(String adresse, int nbChambres) {
        super(adresse);
        this.nbChambres = nbChambres;
    }
    public int getNbChambres() {
        return nbChambres;
    }
    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }
    @Override
    public String toString() {
        return super.toString() + "Nombre de chambres : " + nbChambres;
    }
}
class Immeuble extends Batiment {
    private int nbAppart;
    public Immeuble() {}
    public Immeuble(String adresse, int nbAppart) {
        super(adresse);
        this.nbAppart = nbAppart;
    }
    public int getNbAppart() {
        return nbAppart;
    }
    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }
    @Override
    public String toString() {
        return super.toString() + "Nombre d'appartements : " + nbAppart;
    }
}
