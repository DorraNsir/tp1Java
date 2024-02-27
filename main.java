package TP1;

import java.util.ArrayList;
import java.util.Collections;

public class main {

    public static void main(String[] args) {
    Etudiant e1=new Etudiant(23,"dorra");
    Etudiant e2=new Etudiant(567,"tesnim");
    Etudiant e3=new Etudiant(578,"cyrin");
    Notes n1=new Notes("poo",12.5f);
    Notes n2=new Notes("poo",16.5f);
    Notes n3=new Notes("java",19);
        Notes n4=new Notes("java",19);
        Notes n5=new Notes("java",19);
    e1.addNote(n1);
    e1.addNote(n2);
    e1.addNote(n3);
    e2.addNote(n3);
    e2.addNote(n4);
    e2.addNote(n5);
    e3.addNote(n1);
    e3.addNote(n1);
    e3.addNote(n1);

    ArrayList<Etudiant> listEtudinat =new ArrayList<Etudiant>();
    listEtudinat.add(e1);
    listEtudinat.add(e2);
    listEtudinat.add(e3);
    float moyG=Stats.moyenneGroupe(listEtudinat);


    float min=Stats.getMoinsBonneNote(e1);
    float max=Stats.meilleureNote(e1);
    float moy =Stats.moyenne(e1);
    System.out.println("milleureNote : "+max);
    System.out.println("MoinsBonneNote : "+min);
    System.out.println("moyenne : "+moy);
    System.out.println("moyenneGroupe : "+moyG);
    Stats.meilleur_Etudiant_group(listEtudinat);
    Stats.le_moins_bon_etudiant_group(listEtudinat);

    System.out.println("*********************************");
        Collections.sort(listEtudinat);
        System.out.println("trie par matricule");
        for (Etudiant e:listEtudinat){
            System.out.println("Matricule: " + e.getMatricule() + ", Nom: " + e.getNom());
        }
        System.out.println("trie par Moyenne");
        listEtudinat.sort(new CompareMoyenne());
        for (Etudiant e:listEtudinat){
            System.out.println("Moyenne: " + e.getValue());
        }
        System.out.println("trie par nom");
        listEtudinat.sort(new CompareNom());
        for (Etudiant e:listEtudinat){
            System.out.println("Nom: " + e.getNom());
        }





    }
}
