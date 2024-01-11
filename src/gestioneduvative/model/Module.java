package gestioneduvative.model;

import gestioneduvative.model.Enseignant;
import gestioneduvative.model.Filiere;

public class Module {
//Attributs
    private String intitule;
    private Enseignant professeur;
    private Filiere filiere;
    private int id;

//constructeurs
    public Module(){
    }
    public Module(String intitule, Enseignant professeur,Filiere filiere){
        //initialisation des attributs
        this.intitule=intitule;
        this.professeur=professeur;
        this.filiere=filiere;
    }

//getters
    public String getIntitule() {
        return intitule;
    }
    public Enseignant getProfesseur() {
        return professeur;
    }
    public Filiere getFiliere() {
        return filiere;
    }

    public int getId() {
        return id;
    }

    //setters
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    public void setProfesseur(Enseignant professeur) {
        this.professeur = professeur;
    }
    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
    public void setId(int id) {
        this.id = id;
    }

}
