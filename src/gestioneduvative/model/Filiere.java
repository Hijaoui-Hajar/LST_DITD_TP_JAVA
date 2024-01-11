package gestioneduvative.model;

import java.util.ArrayList;
public class Filiere {
    private String intitule;
    private Enseignant responsable;
    private Departement departement;
    private int id;
    private ArrayList<Module> modules = new ArrayList<>();

//Constructeurs
    public Filiere(){
    }
    public Filiere(String intitule, Enseignant responsable,Departement departement){
        //initialisation des attributs
        this.intitule=intitule;
        this.responsable=responsable;
        this.departement=departement;
    }

//getters
    public String getIntitule() {
        return intitule;
    }
    public Enseignant getResponsable() {
        return responsable;
    }
    public Departement getDepartement() {
        return departement;
    }
    public int getId() {
        return id;
    }
    public ArrayList<Module> getModules() {
        return modules;
    }

//setters
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    public void setResponsable(Enseignant responsable) {
        this.responsable = responsable;
    }
    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
}
