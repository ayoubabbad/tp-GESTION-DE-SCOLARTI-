import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestionUtilisateurs {
    private List<Utilisateur> utilisateurs;

    public GestionUtilisateurs() {
        this.utilisateurs = new ArrayList<>();
    }

    public void ajouterUtilisateur(Utilisateur utilisateur) {
        utilisateurs.add(utilisateur);
    }

    public void trierUtilisateurs() {
        Collections.sort(utilisateurs);
    }

    public void afficherUtilisateurs() {
        for (Utilisateur u : utilisateurs) {
            System.out.println(u.toString());
        }
    }

    public void sauvegarderDansFichier(String nomFichier) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomFichier))) {
            for (Utilisateur u : utilisateurs) {
                writer.println(u.toString());
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de la sauvegarde: " + e.getMessage());
        }
    }

    public void chargerDepuisFichier(String nomFichier) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomFichier))) {
            String line;
            System.out.println("Contenu du fichier " + nomFichier + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Erreur lors du chargement: " + e.getMessage());
        }
    }
}