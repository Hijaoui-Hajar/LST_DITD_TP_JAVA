package gestioneduvative.model;

import java.util.ArrayList;
public class Departement {

//Attributs
    private String intitule;
    private Enseignant responsable;
    private int id;
    private ArrayList<Filiere> filieres = new ArrayList<>();

//constructeurs
    public Departement(){
    }
    public Departement(String intitule, Enseignant responsable){
        //initialisation des attributs
        this.intitule=intitule;
        this.responsable=responsable;
    }
//getters
    public String getIntitule() {
        return intitule;
    }
    public Enseignant getResponsable() {
        return responsable;
    }
    public int getId() {
        return id;
    }
    public ArrayList<Filiere> getFilieres() {
        return filieres;
    }

//setters
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    public void setResponsable(Enseignant responsable) {
        this.responsable = responsable;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setFilieres(ArrayList<Filiere> filieres) {
        this.filieres = filieres;
    }
}
