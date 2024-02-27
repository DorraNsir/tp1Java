package TP1;

import java.util.ArrayList;

public class Etudiant implements Comparable<Etudiant>,Statisticable{
    private String nom;
    private int matricule;
    ArrayList<Notes> notes=new ArrayList<Notes>();

    Etudiant(int matricule,String nom){
        this.matricule=matricule;
        this.nom=nom;
        this.notes=new ArrayList<Notes>();
    }
    public void setNotes(ArrayList<Notes> notes) {
        this.notes = notes;
    }

    public String getNom() {
        return nom;
    }

    public int getMatricule() {
        return matricule;
    }

    public ArrayList<Notes> getNotes() {
        return notes;
    }
    public void addNote(Notes n) {
        notes.add(new Notes(n.getIntitule(),n.getNote()));
    }




    @Override
    public float getValue() {
        float sum = 0;
        for (Notes note : notes) {
            sum += note.getValue();
        }
        if (!notes.isEmpty()) {
            return sum / notes.size();
        } else {
            return 0;
        }
    }

    @Override
    public int compareTo(Etudiant o) {
        return Float.compare(this.getValue(), o.getValue());
    }
}
