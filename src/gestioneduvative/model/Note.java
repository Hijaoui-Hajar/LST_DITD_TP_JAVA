package gestioneduvative.model;

import gestioneduvative.model.Etudiant;
import gestioneduvative.model.Filiere;

public class Note {
//Attributs
    private int id ;
    private float note;
    private Etudiant etudiant;
    private Filiere filiere;

//constructeurs
    public Note(){
    }
    public Note(float note, Etudiant etudiant, Filiere filiere) {
        //initialisation des attributs
        this.note = note;
        this.etudiant = etudiant;
        this.filiere = filiere;
    }

//getters
    public float getNote() {
        return note;
    }
    public Etudiant getEtudiant() {
        return etudiant;
    }
    public Filiere getFiliere() {
        return filiere;
    }
    public int getId() {
        return id;
    }

    //setters
    public void setNote(float note) {
        this.note = note;
    }
    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
    public void setId(int id) {
        this.id = id;
    }
}
