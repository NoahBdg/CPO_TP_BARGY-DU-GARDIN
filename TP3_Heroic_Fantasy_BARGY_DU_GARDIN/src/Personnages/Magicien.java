/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author lebgd
 */
    public class  Magicien extends Personnage {
    private boolean estConfirme;

    public Magicien(String nom, int niveauVie, boolean estConfirme) {
        super(nom, niveauVie);
        this.estConfirme = estConfirme;
    }

    // Setter pour estConfirme
    public void setEstConfirme(boolean estConfirme) {
        this.estConfirme = estConfirme;
    }

    }