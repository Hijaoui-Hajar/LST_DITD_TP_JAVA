package gestioneduvative.model;

import java.util.ArrayList;
public class Enseignant {
    public int length;
    //Attributs
    private String nom;
    private String prenom;
    private String email;
    private String grade;
    private Departement departement;
    private int id;
    private ArrayList<Module> modules = new ArrayList<>();

//constructeur
    public Enseignant(String nom, String prenom, String email, String grade, String departement){
    }
    public Enseignant(String nom, String prenom, String email, String grade, Departement departement){
    // Initialisation des attributs
    this.nom=nom;
    this.prenom=prenom;
    this.email=email;
    this.grade=grade;
    this.departement=departement;
}

//getters
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getEmail() {
        return email;
    }
    public String getGrade() {
        return grade;
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
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGrade(String grade) {
        this.grade = grade;
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
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Enseignant enseignant = (Enseignant) obj;

        return id == enseignant.id;
    }
}
