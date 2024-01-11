package gestioneduvative.service;
import gestioneduvative.model.Departement;
import gestioneduvative.model.Enseignant;
import gestioneduvative.model.Filiere;

import java.util.ArrayList;
public class ServiceFiliere {
    public static Filiere ajouterFiliere(String intitule, Enseignant responsable, Departement departement) {
        return  new Filiere();
    }

    public static Filiere modifierFiliere(int id , String intitule, Enseignant responsable, Departement departement){
        return  new Filiere();
    }
    public static ArrayList<Filiere> supprimerFiliereById(int id){
        return  Database.filieres;
    }

    public static Filiere getFiliereById(int id){
        return  new Filiere();
    }

    public static ArrayList<Filiere> getTousFiliere(){
        return  Database.filieres;
    }
}