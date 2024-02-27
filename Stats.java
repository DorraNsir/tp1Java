package TP1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Stats {
    public static float meilleureNote(Etudiant e) {

        return Collections.max(e.notes).getValue();

    }
    public static float getMoinsBonneNote(Etudiant e) {

        return Collections.min(e.notes).getValue();
    }
    public static float moyenne (Etudiant e){
        float total=0;
        for (Notes n: e.notes){
            total+=n.getValue();
        }
        return total/e.notes.size();
    }
    public static float moyenneGroupe(ArrayList<Etudiant> etudiants) {
        float total=0;
        for(Etudiant etudiant:etudiants) {
            total+=etudiant.getValue();
        }
        System.out.println(total);
        return total/etudiants.size();

    }
    public static void meilleur_Etudiant_group(ArrayList<Etudiant> etudiants){
        Etudiant max = etudiants.get(0);
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getValue() > max.getValue()) {
                max = etudiant;
            }
        }
        System.out.println("le millieur etudinat de cette group est  :"+ max.getNom());
    }
    public static void le_moins_bon_etudiant_group(ArrayList<Etudiant> etudiants){
        Etudiant min = etudiants.get(0);
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getValue() < min.getValue()) {
                min = etudiant;
            }
        }

        System.out.println("le moins bon etudinat de cette group est  :"+ min.getNom());
    }


}
