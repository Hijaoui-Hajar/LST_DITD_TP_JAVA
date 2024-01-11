package gestioneduvative.model;

import java.util.ArrayList;

public class Etudiant {
    private String nom;
    private String prenom;
    private String email;
    private int apogee;
    private Filiere filiere ;
    private int id;
    private ArrayList<Note> notes = new ArrayList<>();

//constructeurs
    public Etudiant(){
    }
    public Etudiant(String nom, String prenom, String email, int apogee, Filiere filiere){
        //initialisation des attributs
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.apogee=apogee;
        this.filiere=filiere;
    }

//getters
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;}
    public String getEmail() {
        return email;
    }
    public Filiere getFiliere() {
        return filiere;
    }
    public int getApogee() {
        return apogee;
    }
    public int getId() {
        return id;
    }
    public ArrayList<Note> getNotes() {
        return notes;
    }

//Setters
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
    public void setApogee(int apogee) {
        this.apogee = apogee;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }

}