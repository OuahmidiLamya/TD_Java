package TD2;
public class Ex3 {
    public static void main(String[] args) {
        Livre livre1 = new Livre("Titre 1", "Auteur 1", 29.99, 2020);
        System.out.println("Livre 1 : " + livre1);
        Livre livre2 = new Livre("Titre 2", "Auteur 2");
        livre2.setPrix(19.99);
        livre2.setAnnee(2021);
        System.out.println("Livre 2 : " + livre2);
        Livre livre3 = new Livre(livre1);
        System.out.println("Livre 3 (copie de Livre 1) : " + livre3);
    }
}
 class Livre {
    private String titre;
    private String auteur;
    private double prix;
    private int annee;
    public Livre() {}
    public Livre(String titre)
      {
        this.titre = titre;
      }
    public Livre(String titre, String auteur)
      {
        this.titre = titre;
        this.auteur = auteur;
      }
    public Livre(String titre, String auteur, double prix)
      {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
      }
    public Livre(String titre, String auteur, double prix, int annee)
      {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.annee = annee;
      }
    public Livre(Livre livre)
      {
        this.titre = livre.titre;
        this.auteur = livre.auteur;
        this.prix = livre.prix;
        this.annee = livre.annee;
      }
    public String getTitre()
      {
        return titre;
      }
    public void setTitre(String titre)
      {
        this.titre = titre;
      }
    public String getAuteur()
      {
        return auteur;
      }
    public void setAuteur(String auteur)
      {
        this.auteur = auteur;
      }
    public double getPrix()
      {
        return prix;
      }
    public void setPrix(double prix)
      {
        this.prix = prix;
      }
    public int getAnnee()
      {
        return annee;
      }
    public void setAnnee(int annee)
      {
        this.annee = annee;
      }
    @Override
    public String toString()
      {
        return "Livre{" + "titre='" + titre + '\'' + ", auteur='" + auteur + '\'' + ", prix=" + prix +
                ", annee=" + annee + '}';
      }
}

