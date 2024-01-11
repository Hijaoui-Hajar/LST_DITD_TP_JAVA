package gestioneduvative.service;

import gestioneduvative.model.*;
import gestioneduvative.model.Module;

import java.util.ArrayList;

public class Database {
        private static int departementId = 0;
        private static int enseignantId = 0;
        private static int etudiantId = 0;
        private static int filiereId = 0;
        private static int moduleId = 0;
        private static int noteId = 0 ;
        public static ArrayList<Departement> departements = new ArrayList<>();
        public static ArrayList<Enseignant> enseignants = new ArrayList<>();
        public static ArrayList<Filiere> filieres = new ArrayList<>();
        public static ArrayList<Module> modules = new ArrayList<>();
        public static ArrayList<Etudiant> etudiants = new ArrayList<>();
        public static ArrayList<Note> notes = new ArrayList<>();

        public static int getDepartmentId(){
            return ++departementId;
        }
        public static int getEnseignantId() {
            return ++enseignantId;
        }
        public static int getEtudiantId() {
        return ++etudiantId;
    }
        public static int getFiliereId() {
        return ++filiereId;
    }
        public static int getModuleId() {
        return ++moduleId;
    }
        public static int getNoteId(){
            return ++noteId;
        }

// Méthodes pour ajouter des instances
    public static void ajouterDepartement(Departement departement) {
        departement.setId(getDepartmentId());
        departements.add(departement);
    }

    public static void ajouterEnseignant(Enseignant enseignant) {
        enseignant.setId(getEnseignantId());
        enseignants.add(enseignant);
    }
    public static void ajouterEtudiant(Etudiant etudiant) {
        etudiant.setId(getEtudiantId());
        etudiants.add(etudiant);
    }
    public static void ajouterFiliere(Filiere filiere) {
        filiere.setId(getFiliereId());
        filieres.add(filiere);
    }

    public static void ajouterModule(Module module) {
        module.setId(getModuleId());
        modules.add(module);
    }

    public static void ajouterNote(Note note) {
        note.setId(getNoteId());
        notes.add(note);
    }

// Méthodes pour supprimer des instances
    public static void supprimerDepartment(Departement department) {
        departements.remove(department);
    }
    public static void supprimerEnseignant(Enseignant enseignant) {
        enseignants.remove(enseignant);
    }
    public static void supprimerEtudiant(Etudiant etudiant) {
        etudiants.remove(etudiant);
    }
    public static void supprimerFiliere(Filiere filiere) {
        filieres.remove(filiere);
    }
    public static void SupprimerModule(Module module) {
        modules.remove(module);
    }
    public static void SupprimerNote(Note note) {
        notes.remove(note);
    }

// Méthodes pour récupérer des instances par id
    public static Departement getDepartementById(int id) {
        for (Departement department : departements) {
            if (department.getId() == id) {
                return department;
            }
        }
        return null;
    }
    public static Enseignant getEnseignantById(int id) {
        for (Enseignant enseignant : enseignants) {
            if (enseignant.getId() == id) {
                return enseignant;
            }
        }
        return null;
    }

    public static Filiere getFiliereById(int id) {
        for (Filiere filiere : filieres) {
            if (filiere.getId() == id) {
                return filiere;
            }
        }
        return null;
    }

    public static Module getModuleById(int id) {
        for (Module module : modules) if (module.getId() == id) {
            return module;
        }
        return null;
    }
    public static Etudiant getEtudiantById(int id) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getId() == id) {
                return etudiant;
            }
        }
        return null;
    }
    public static Note getNoteById(int id) {
        for (Note note : notes) {
            if (note.getId() == id) {
                return note;
            }
        }
        return null;
    }

// Méthodes pour récupérer tous les instances
    public static ArrayList<Departement> getTousDepartements() {
        return Database.departements;
    }
    public static ArrayList<Enseignant> getTousEnseignants() {
        return Database.enseignants;
    }
    public static ArrayList<Filiere> getTousFiliere(){
        return  Database.filieres;
    }
    public static ArrayList<Etudiant> getTousEtudiant(){
        return  Database.etudiants;
    }
    public static ArrayList<Module> getTousModule(){
        return Database.modules;
    }
}