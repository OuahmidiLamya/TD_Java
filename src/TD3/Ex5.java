package TD3;
public class Ex5 {
    public static void main(String[] args) {
        Vehicule vehicule = new Vehicule(4);
        System.out.println(vehicule.toString());
        Moto moto = new Moto(2);
        System.out.println(moto.toString());
        Avion avion1 = new Avion(150);
        Avion avion2 = new Avion(200, 4);
        System.out.println(avion1.toString());
        System.out.println(avion2.toString());
        Triporteur triporteur = new Triporteur(1);
        System.out.println(triporteur.toString());
    }
}
class Vehicule {
    private int nbPassager;
    public Vehicule(int n) {
        nbPassager = n;
    }
    public String toString() {
        return "Nombre de passagers : " + nbPassager;
    }
}
class Moto extends Vehicule {
    private int nbRoues = 2;
    public Moto(int nbPassager) {
        super(nbPassager);
    }
}
class Avion extends Vehicule {
    private int nbMoteur;
    public Avion(int nbP) {
        super(nbP);
    }
    public Avion(int nbP, int nbM) {
        super(nbP);
        nbMoteur = nbM;
    }
}
class Triporteur extends Moto {
    public Triporteur(int nbPassager) {
        super(nbPassager);
    }
}





