package TD2;
public class Ex6 {
    public static void main(String[] args) {
        Banque monCompte = new Banque(1, 5000.75, "AB 1200");
        System.out.println("Informations initiales du compte :");
        monCompte.afficherInformations();
        monCompte.afficherSolde();
        monCompte.deposer(500);
        System.out.println("Informations après le dépôt :");
        monCompte.afficherInformations();
        monCompte.afficherSolde();
        monCompte.retirer(200);
        System.out.println("Informations après le retrait :");
        monCompte.afficherInformations();
        monCompte.afficherSolde();
    }
}
class Banque{
    private int NCompte;
    private double solde;
    private String CIN;
    public Banque(int numeroCompte, double soldeInitial, String titulaire) {
        this.NCompte = numeroCompte;
        this.solde = soldeInitial;
        this.CIN = titulaire;
    }
    public void afficherInformations() {
        System.out.println("Numéro de compte : " + NCompte);
        System.out.println("Titulaire du compte : " + CIN);
    }
    public void afficherSolde() {
        System.out.println("Solde actuel : " + solde);
    }
    public void deposer(double montant) {
        solde += montant;
        System.out.println("Dépôt de " + montant + " effectué avec succès.");
    }
    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
            System.out.println("Retrait de " + montant + " effectué avec succès.");
        } else {
            System.out.println("Solde insuffisant pour effectuer le retrait.");
        }
    }
}
