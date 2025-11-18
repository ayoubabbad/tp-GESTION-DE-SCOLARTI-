import java.util.Date;

public class Enseignant extends Employee implements Serializable {
    private String discipline;
    private int nbHeure;

    public Enseignant(String discipline, int nbHeure, Date dateRecrutement, int ppr, String nomComplet, String email, Date dateNaissance) {
        super(dateRecrutement, ppr, nomComplet, email, dateNaissance);
        this.discipline = discipline;
        this.nbHeure = nbHeure;
    }

    public boolean isOfTheSameClassAs(Object o) {
        return o instanceof Enseignant;
    }

    @Override
    public String toString() {
        return super.toString() + ", Discipline: " + discipline + ", Nb Heures: " + nbHeure;
    }

    public void afficher() {
        System.out.println(this.toString());
    }
}