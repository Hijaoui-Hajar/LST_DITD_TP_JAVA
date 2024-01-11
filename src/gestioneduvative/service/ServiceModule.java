package gestioneduvative.service;
import java.util.ArrayList;

import gestioneduvative.model.Enseignant;
import gestioneduvative.model.Filiere;
import gestioneduvative.model.Module;
public class ServiceModule {
    public static Module ajouterFiliere(String intitule, Enseignant professeur,  Filiere filiere) {
         return  new Module();
    }

    public static Module modifierFiliere(int id , String intitule, Enseignant professeur,  Filiere filiere){
         return  new Module();
    }
    public static ArrayList<Module> supprimerModuleById(int id){
         return Database.modules;
    }

    public static Module getModuleById(int id){
         return  new Module();
    }

    public static ArrayList<Module> getTousModule(){
         return Database.modules;
        }
}

