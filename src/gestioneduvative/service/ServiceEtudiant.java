package gestioneduvative.service;

import gestioneduvative.model.Etudiant;
import gestioneduvative.model.Filiere;

import java.util.ArrayList;

public class ServiceEtudiant {
    public static Etudiant ajouterEtudiant(String nom, String prenom, String email, int apogee, Filiere filiere){
        return  new Etudiant();
    }

    public static Etudiant modifierEtudiant(int id,String nom, String prenom, String email, int apogee, Filiere filiere){
        return  new Etudiant();
    }
    public static ArrayList<Etudiant> supprimerEtudiantById(int id){
        return  Database.etudiants;
    }

    public static Etudiant getEtudiantById(int id){
        return  new Etudiant();
    }

    public static ArrayList<Etudiant> getTousEtudiant(){
        return  Database.etudiants;
    }
}
