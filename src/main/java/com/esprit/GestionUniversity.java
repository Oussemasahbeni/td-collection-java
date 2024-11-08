package com.esprit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GestionUniversity implements University {

    private final List<Etudiant> etudiants = new ArrayList<>();
    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
       return etudiants.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant e : etudiants) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        etudiants.remove(e);
    }

    @Override
    public void displayEtudiants() {
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEtudiantsParId() {
        etudiants.sort(Comparator.comparing(Etudiant::getId));
    }

    @Override
    public void trierEtudiantsParNom() {
        etudiants.sort(Comparator.comparing(Etudiant::getNom));
    }
}
