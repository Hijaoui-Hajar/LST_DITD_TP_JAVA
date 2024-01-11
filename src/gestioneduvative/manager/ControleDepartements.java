package gestioneduvative.manager;

import gestioneduvative.model.Departement;
import gestioneduvative.service.Database;
import gestioneduvative.service.ServiceDepartement;
import gestioneduvative.service.ServiceEnseignant;
import gestioneduvative.Main;
import gestioneduvative.model.Enseignant;
public class ControleDepartements {
// Affichage de menu des options du gestionnaire de départements
    public static void afficherMenu(){
        System.out.println("-------------------------[ Départements ]---------------------------");


        System.out.println("1: Pour ajouter un département");
        System.out.println("2: Pour afficher les départements");
        System.out.println("3: Pour modifier un département");
        System.out.println("4: Pour supprimer un département");
        System.out.println("0: Pour retourner au menu principal");

        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch(option) {
            case 1:
                creerDepartement();
                break;
            case 2:
                afficherDepartements();
                break;
            case 3:
                modifierDepartement();
                break;
            case 4:
                supprimerDepartement();
                break;
            default:
                Main.afficherMenuPrincipal();
        }
    }
// Affichage de liste des départements avec leurs détails
    public static void afficherDepartements(){
        System.out.println("-------------[ Liste des Départements ]-------------");
        for (Departement departement : Database.departements) {
            System.out.print("Id : " + departement.getId());
            System.out.print(" | Intitulé : " + departement.getIntitule());
            if (!Main.isNull(departement.getResponsable())) {
                System.out.print(" | Responsable : " + departement.getResponsable().getNom() + " " + departement.getResponsable().getPrenom());
            }
            System.out.println("");
        }
    }
//ajouter un nouveau département
    public static void creerDepartement(){
        String intitule = Main.getStringInput("Entrez l'intitulé :");
        ControleEnseignants.afficherEnseignants();
        int id = Main.getIntInput("Sélectionnez un enseignant par id :");
        ServiceDepartement.ajouterDepartement(intitule, ServiceEnseignant.getEnseignantById(id));

        System.out.println("Département ajouté avec succès.");
        afficherDepartements();
        afficherMenu();
    }

// Permet à l'utilisateur de modifier un département existant
    public static void modifierDepartement() {
        afficherDepartements();
        int id = Main.getIntInput("Sélectionnez un département par id :");
        String intitule = Main.getStringInput("Entrez le nouvel intitulé :");
        ControleEnseignants.afficherEnseignants();
        int idEnseignant = Main.getIntInput("Sélectionnez un enseignant par id :");

        ServiceDepartement.modifierDepartement(intitule, ServiceEnseignant.getEnseignantById(id), id);

        System.out.println("Département modifié avec succès.");
        afficherDepartements();
        afficherMenu();
    }

// Permet à l'utilisateur de supprimer un département existant
    public static void supprimerDepartement() {
        afficherDepartements();
        int id = Main.getIntInput("Sélectionnez un département par id :");
        ServiceDepartement.supprimerDepartementById(id);

        System.out.println("Département supprimé avec succès.");
        afficherDepartements();
    }
}

