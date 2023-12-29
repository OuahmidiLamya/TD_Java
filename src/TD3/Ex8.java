package TD3;

public class Ex8 {
    public static void main(String[] args) {
        Patron patron = new Patron("Dupont", "Jean", 5000);
        System.out.println("Patron: " + patron);
        System.out.println("Salaire du patron: " + patron.gains());

        TravailleurCommission tc = new TravailleurCommission("Martin", "Paul", 2000, 0.1);
        tc.setQuantite(100);
        System.out.println("Travailleur à commission: " + tc);
        System.out.println("Salaire du travailleur à commission: " + tc.gains());

        TravailleurHoraire th = new TravailleurHoraire("Dubois", "Sophie", 15);
        th.setHeures(80);
        System.out.println("Travailleur horaire: " + th);
        System.out.println("Salaire du travailleur horaire: " + th.gains());
    }
}
interface Salaire {
    double gains();
}

interface Personne {
    String getNom();
    String getPrenom();
}

class Employee implements Salaire, Personne {
    protected String nom;
    protected String prenom;

    public Employee() {
    }

    public Employee(String nom, String prenom) {
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

    @Override
    public double gains() {
        return 0; // Méthode abstraite à implémenter dans les classes dérivées
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom;
    }
}

class Patronn extends Employe {
    private double salaire;

    public Patronn() {
    }

    public Patronn(String nom, String prenom, double salaire) {
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
        return super.toString() + ", Salaire: " + salaire;
    }
}

class TravailleurCommissionn extends Employe {
    private double salaire;
    private double commission;
    private int quantite;

    public TravailleurCommissionn() {
    }

    public TravailleurCommissionn(String nom, String prenom, double salaire, double commission) {
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
        return salaire + commission * quantite;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salaire: " + salaire + ", Commission: " + commission + ", Quantité: " + quantite;
    }
}

class TravailleurHorairee extends Employe {
    private double retribution;
    private double heures;

    // Constructeurs
    public TravailleurHorairee() {
    }

    public TravailleurHorairee(String nom, String prenom, double retribution) {
        super(nom, prenom);
        this.retribution = retribution;
    }

    public double getRetribution() {
        return retribution;
    }

    public void setRetribution(double retribution) {
        this.retribution = retribution;
    }

    public double getHeures() {
        return heures;
    }

    public void setHeures(double heures) {
        this.heures = heures;
    }

    @Override
    public double gains() {
        return retribution * heures;
    }

    @Override
    public String toString() {
        return super.toString() + ", Rémunération horaire: " + retribution + ", Heures travaillées: " + heures;
    }
}



