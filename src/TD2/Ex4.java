package TD2;
public class Ex4 {
    public static void main(String[] args) {
        Temps temps1 = new Temps();
        Temps temps2 = new Temps(10);
        Temps temps3 = new Temps(8, 45);
        Temps temps4 = new Temps(23, 59, 30);
        Temps temps5 = new Temps(temps4);
        System.out.println("Temps 1: " + temps1);
        System.out.println("Temps 2: " + temps2);
        System.out.println("Temps 3: " + temps3);
        System.out.println("Temps 4: " + temps4);
        System.out.println("Temps 5 (copie de temps 4): " + temps5);
        temps1.ajouterHeures(2);
        temps2.ajouterMinutes(15);
        temps3.ajouterSecondes(30);
        temps4.ajouterMinutes(10);
        System.out.println("Après ajout de temps:");
        System.out.println("Temps 1: " + temps1);
        System.out.println("Temps 2: " + temps2);
        System.out.println("Temps 3: " + temps3);
        System.out.println("Temps 4: " + temps4);
    }
}
class Temps {
    private int heures;
    private int minutes;
    private int secondes;

    public Temps() {}
    public Temps(int heures) {
        this.heures=heures;
    }
    public Temps(int heures, int minutes) {
        this.heures=heures;
        this.minutes=minutes;
    }
    public Temps(int heures, int minutes, int secondes) {
        this.heures=heures;
        this.minutes=minutes;
        this.secondes=secondes;
    }
    public Temps(Temps temps) {
        this(temps.getHeures(), temps.getMinutes(), temps.getSecondes());
    }
    public int getHeures() {
        return heures;
    }
    public void setHeures(int heures) {
        if (heures >= 0 && heures <= 23) {
            this.heures = heures;
        } else {
            System.out.println("Heures invalides. Les heures doivent être comprises entre 0 et 23.");
        }
    }
    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            System.out.println("Minutes invalides. Les minutes doivent être comprises entre 0 et 59.");
        }
    }
    public int getSecondes() {
        return secondes;
    }
    public void setSecondes(int secondes) {
        if (secondes >= 0 && secondes <= 59) {
            this.secondes = secondes;
        } else {
            System.out.println("Secondes invalides. Les secondes doivent être comprises entre 0 et 59.");
        }
    }
    public void ajouterHeures(int heures){
        this.setHeures(this.getHeures() + heures);
    }
    public void ajouterMinutes(int minutes){
        minutes += this.getMinutes();
        ajouterHeures(minutes/60);
        this.setMinutes(minutes % 60);
    }
    public void ajouterSecondes(int secondes){
        secondes += this.getSecondes();
        ajouterMinutes(secondes/60);
        this.setSecondes(secondes % 60);
    }
    @Override
    public String toString() {
        return "Temps{" + "heures=" + heures + ", minutes=" + minutes + ", secondes=" + secondes + '}';
    }
}

