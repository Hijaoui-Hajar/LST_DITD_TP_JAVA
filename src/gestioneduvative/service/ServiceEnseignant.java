package gestioneduvative.service;

import gestioneduvative.model.Departement;
import gestioneduvative.model.Enseignant;

import java.util.ArrayList;

public class ServiceEnseignant {

//Methode ajouter Enseignant
        public static Enseignant ajouterEnseignant(String nom, String prenom, String email, String grade, String departement) {
            Enseignant enseignant = new Enseignant(nom, prenom, email, grade, departement);
            Database.ajouterEnseignant(enseignant);
            return  enseignant;
        }
//Methode modifier enseignant
        public static Enseignant modifierEnseignant(int id, String nom, String prenom, String email, String grade ) {
            Enseignant enseignant = Database.getEnseignantById(id);
            Departement departement;
            if (enseignant != null) {
                enseignant.setNom(nom);
                enseignant.setPrenom(prenom);
                enseignant.setEmail(email);
                enseignant.setGrade(grade);
                enseignant.setDepartement(departement);
            }
            return new Enseignant(nom, prenom, email, grade, departement);
        }
//Methode supprimer Enseignant
    public static ArrayList<Enseignant> supprimerEnseignantById(int id) {
        Enseignant enseignant = Database.getEnseignantById(id);
        if (enseignant != null) {
            Database.supprimerEnseignant(enseignant);
        }
        return Database.enseignants;
    }
//Methode obtenir Enseignant
    public static Enseignant getEnseignantById(int id) {
        for (Enseignant enseignant : Database.enseignants) {
            if (enseignant.getId() == id)
                return  enseignant;
        }
        return  new Enseignant();
    }
//Methode obtenir tous les Enseignants
    public static ArrayList<Enseignant> getTousEnseignants() {
        return Database.enseignants;
    }

}

