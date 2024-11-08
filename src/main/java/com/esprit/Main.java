package com.esprit;

public class Main {
    public static void main(String[] args) {
        GestionUniversity gestionUniversity = new GestionUniversity();
        Etudiant etudiant1 = new Etudiant("1", "Smith", "John");
        Etudiant etudiant2 = new Etudiant("2", "Doe", "Jane");
        Etudiant etudiant3 = new Etudiant("3", "Brown", "Charlie");
        Etudiant etudiant4 = new Etudiant("4", "Johnson", "Emily");
        Etudiant etudiant5 = new Etudiant("5", "Williams", "Michael");
        gestionUniversity.ajouterEtudiant(etudiant1);
        gestionUniversity.ajouterEtudiant(etudiant2);
        gestionUniversity.ajouterEtudiant(etudiant3);
        gestionUniversity.ajouterEtudiant(etudiant4);
        gestionUniversity.ajouterEtudiant(etudiant5);
        gestionUniversity.displayEtudiants();
        System.out.println("Recherche de l'etudiant 1 : " + gestionUniversity.rechercherEtudiant(etudiant1));
        System.out.println("Recherche de l'etudiant 6 : " + gestionUniversity.rechercherEtudiant(new Etudiant("6", "Taylor", "Sophia")));
        System.out.println("Recherche de l'etudiant Smith : " + gestionUniversity.rechercherEtudiant("Smith"));
        gestionUniversity.supprimerEtudiant(etudiant1);
        System.out.println("Apres suppression de l'etudiant 1");
        gestionUniversity.displayEtudiants();
        System.out.println("Trier les etudiants par id");
        gestionUniversity.trierEtudiantsParId();
        System.out.println("Apres trier les etudiants par id");
        gestionUniversity.displayEtudiants();
        System.out.println("Trier les etudiants par nom");
        gestionUniversity.trierEtudiantsParNom();
        System.out.println("Apres trier les etudiants par nom");
        gestionUniversity.displayEtudiants();
    }
}