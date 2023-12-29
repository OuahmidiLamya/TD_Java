package TD3;
public class Ex7 {
    public static void main(String[] args) {
        Employe employe = new Patron("Doe", "John", 5000.0);
        System.out.println(employe.toString());
        System.out.println("Gains: " + employe.gains());
        TravailleurCommission travailleurCommission = new TravailleurCommission("Smith", "Alice", 2000.0, 5.0);
        travailleurCommission.setQuantite(10);
        System.out.println(travailleurCommission.toString());
        System.out.println("Gains: " + travailleurCommission.gains());
        TravailleurHoraire travailleurHoraire = new TravailleurHoraire("Johnson", "Bob", 15.0);
        travailleurHoraire.setHeures(40);
        System.out.println(travailleurHoraire.toString());
        System.out.println("Gains: " + travailleurHoraire.gains());
    }
}
abstract class Employe {
    private String nom;
    private String prenom;
    public Employe() {
    }
    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public abstract double gains();
    @Override
    public String toString() {
        return "Employe [nom=" + nom + ", prenom=" + prenom + "]";
    }
}
class Patron extends Employe {
    private double salaire;
    public Patron() {
    }
    public Patron(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }
    public double getSalaire() {
        return salaire;
    }
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    @Override
    public double gains() {
        return salaire;
    }
    @Override
    public String toString() {
        return "Patron [salaire=" + salaire + ", " + super.toString() + "]";
    }
}
class TravailleurCommission extends Employe {
    private double salaire;
    private double commission;
    private int quantite;
    public TravailleurCommission() {
    }
    public TravailleurCommission(String nom, String prenom, double salaire, double commission) {
        super(nom, prenom);
        this.salaire = salaire;
        this.commission = commission;
    }
    public double getSalaire() {
        return salaire;
    }
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    public double getCommission() {
        return commission;
    }
    public void setCommission(double commission) {
        this.commission = commission;
    }
    public int getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    @Override
    public double gains() {
        return salaire + (commission * quantite);
    }
    @Override
    public String toString() {
        return "TravailleurCommission [salaire=" + salaire + ", commission=" + commission + ", quantite=" + quantite
                + ", " + super.toString() + "]";
    }
}
class TravailleurHoraire extends Employe {
    private double retribution;
    private int heures;
    public TravailleurHoraire() {
    }
    public TravailleurHoraire(String nom, String prenom, double retribution) {
        super(nom, prenom);
        this.retribution = retribution;
    }
    public double getRetribution() {
        return retribution;
    }
    public void setRetribution(double retribution) {
        this.retribution = retribution;
    }
    public int getHeures() {
        return heures;
    }
    public void setHeures(int heures) {
        this.heures = heures;
    }
    @Override
    public double gains() {
        return retribution * heures;
    }
    @Override
    public String toString() {
        return "TravailleurHoraire [retribution=" + retribution + ", heures=" + heures + ", " + super.toString() + "]";
    }
}

