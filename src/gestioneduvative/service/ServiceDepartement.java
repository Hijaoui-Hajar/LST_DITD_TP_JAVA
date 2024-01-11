package gestioneduvative.service;

import gestioneduvative.model.Departement;
import gestioneduvative.model.Enseignant;
import java.util.ArrayList;

public class ServiceDepartement {
//Methode ajouter departement
    public static Departement ajouterDepartement(String intitule,Enseignant responsable){
        Departement departement = new Departement();
        departement.setIntitule(intitule);
        departement.setId(Database.getDepartmentId());
        if (responsable.length > 0) {
            departement.setResponsable(responsable);
        }
        Database.departements.add(departement);
        return departement;
    }
//Methode modifier departement
    public static Departement modifierDepartement(String intitule, Enseignant responsable, int id){
        for(Departement departement: Database.departements) {
            if (departement.getId() == id) {
                departement.setIntitule(intitule);
                if (responsable.length > 0) {
                    departement.setResponsable(responsable);
                }
                return departement;
            }
        }
        return new Departement();
}
//Methode supprimer departement
    public static ArrayList<Departement> supprimerDepartementById(int id){
        Database.departements.remove(getDepartementById(id));
        return Database.departements;
    }
//Methode obtenir departement par id
    public static Departement getDepartementById(int id){
        for (Departement departement : Database.departements) {
            if (departement.getId() == id) {
                return departement;
            }
        }
        return new Departement();
    }
//Methode obtenir tous les departement
    public static ArrayList<Departement> getTousDepartements() {
        return Database.departements;
    }
}


