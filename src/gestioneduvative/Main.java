package gestioneduvative;

import gestioneduvative.manager.ControleDepartements;
import gestioneduvative.manager.ControleEnseignants;
import gestioneduvative.model.Enseignant;
import gestioneduvative.service.Database;

import java.util.Scanner;

public class Main {

// Vérifie si un objet est nul
    public static boolean isNull(Object objet) {
        return objet == null;
    }

// Obtenir une entrée entière de l'utilisateur
    public static int getIntInput(String... message) {
        Scanner scanner = new Scanner(System.in);
        String msg = "Entrez un nombre entier : ";
        if (message.length > 0)
            msg = message[0];
        System.out.print(msg);

        int nombre = scanner.nextInt();
        return nombre;
    }

// Obtenir une entrée de texte de l'utilisateur
    public static String getStringInput(String... message) {
        Scanner scanner = new Scanner(System.in);
        String msg = "Entrez un texte : ";
        if (message.length > 0)
            msg = message[0];
        System.out.print(msg);

        String texte = scanner.nextLine();
        return texte;
    }

// Affichage de menu principal
    public static void afficherMenuPrincipal() {
        System.out.println("-------------------------[ Bienvenue ]---------------------------");

        System.out.println("1: Gérer les départements");
        System.out.println("2: Gérer les filières");
        System.out.println("3: Gérer les enseignants");
        System.out.println("4: Gérer les modules");
        System.out.println("5: Gérer les étudiants");
        System.out.println("0: Quitter");

        int option = getIntInput("Veuillez sélectionner une option : ");
        switch (option) {
            case 1:
                ControleDepartements.afficherMenu();
                break;
            case 2:
                ;
                break;
            case 3:
                ControleEnseignants.afficherMenu();
                break;
            case 4:
                ;
                break;
            case 5:
                ;
                break;
            default:
                System.out.println("Au revoir !");
                System.exit(0);
        }
    }

    public static void main(String[] args) {

// Initialisation instance d'enseignant pour les tests
        Enseignant enseignant = new Enseignant(nom, prenom, email, grade, departement);
        enseignant.setNom("Amine");
        enseignant.setPrenom("Ben Charif");
        enseignant.setEmail("test@gmail.com");
        enseignant.setGrade("PES");
        enseignant.setId(Database.getEnseignantId());
        Database.enseignants.add(enseignant);

// Afficher le menu principal
        while (true) {
        afficherMenuPrincipal();
        }
    }
}