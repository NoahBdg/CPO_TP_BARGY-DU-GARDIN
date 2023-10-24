/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;


public abstract class Personnage {
    private String nom;
    private int niveauVie;
    private ArrayList<Arme> armes;
    private Arme armePortee; // Propriété pour l'arme actuellement portée (initialisée à null)


    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        this.armes = new ArrayList<>();
        this.armePortee = null;
    }

    
    public int getNiveauVie() {
        return niveauVie;
    }

    public String getNom() {
        return nom;
    }
    
    public void ajouterArme(Arme arme) {
        if (armes.size() < 5) { 
            armes.add(arme);
        } else {
            System.out.println("Le personnage ne peut pas posséder plus de 5 armes.");
        }
}
    public Arme getArmePortee() {
        return armePortee;
    }
    
    public ArrayList<Arme> getArmes() {
        return armes;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                ", niveauVie=" + niveauVie +
                '}';
    }

}

    