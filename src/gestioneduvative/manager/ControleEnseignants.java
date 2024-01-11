package gestioneduvative.manager;

import gestioneduvative.model.Departement;
import gestioneduvative.model.Enseignant;
import gestioneduvative.service.Database;
import gestioneduvative.Main;
import gestioneduvative.service.ServiceEnseignant;

public class ControleEnseignants {

// Affichage du menu des options du gestionnaire d'enseignants
    public static void afficherMenu() {
        System.out.println("-------------------------[ Enseignants ]---------------------------");

        System.out.println("1: Pour ajouter un enseignant");
        System.out.println("2: Pour afficher les enseignants");
        System.out.println("3: Pour modifier un enseignant");
        System.out.println("4: Pour supprimer un enseignant");
        System.out.println("0: Pour retourner au menu principal");

        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch (option) {
            case 1:
                creerEnseignant();
                break;
            case 2:
                afficherEnseignants();
                break;
            case 3:
                modifierEnseignant();
                break;
            case 4:
                supprimerEnseignant();
                break;
            default:
                Main.afficherMenuPrincipal();
        }
    }

    // Affichage de la liste des enseignants avec leurs détails
    public static void afficherEnseignants() {
        System.out.println("-------------[ Liste des Enseignants ]-------------");
        for (Enseignant enseignant : Database.enseignants) {
            System.out.print("Id : " + enseignant.getId());
            System.out.print(" | Nom : " + enseignant.getNom());
            System.out.print(" | Prénom : " + enseignant.getPrenom());
            System.out.print(" | Email : " + enseignant.getEmail());
            System.out.print(" | Grade : " + enseignant.getGrade());
            System.out.print(" | Département : " + enseignant.getDepartement());
            System.out.println("");
        }
    }

    // Ajouter un nouvel enseignant
    public static void creerEnseignant() {
        String nom = Main.getStringInput("Entrez le nom :");
        String prenom = Main.getStringInput("Entrez le prénom :");
        String email = Main.getStringInput("Entrez l'email :");
        String grade = Main.getStringInput("Entrez le grade :");
        String departement = Main.getStringInput("Entrez le département :");

        ServiceEnseignant.ajouterEnseignant(nom, prenom, email, grade, departement);

        System.out.println("Enseignant ajouté avec succès.");
        afficherEnseignants();
        afficherMenu();
    }

// modifier un enseignant existant
    public static void modifierEnseignant() {
        afficherEnseignants();
        int id = Main.getIntInput("Sélectionnez un enseignant par id :");
        String nom = Main.getStringInput("Entrez le nouveau nom :");
        String prenom = Main.getStringInput("Entrez le nouveau prénom :");
        String email = Main.getStringInput("Entrez le nouvel email :");
        String grade = Main.getStringInput("Entrez le nouvel grade :");

        ServiceEnseignant.modifierEnseignant(id, nom, prenom, email,grade);

        System.out.println("Enseignant modifié avec succès.");
        afficherEnseignants();
        afficherMenu();
    }

    // Permet à l'utilisateur de supprimer un enseignant existant
    public static void supprimerEnseignant() {
        afficherEnseignants();
        int id = Main.getIntInput("Sélectionnez un enseignant par id :");
        ServiceEnseignant.supprimerEnseignantById(id);

        System.out.println("Enseignant supprimé avec succès.");
        afficherEnseignants();
    }
}

