/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author lebgd
 */
public class Guerrier extends Personnage {
    private boolean estACheval;

    public Guerrier(String nom, int niveauVie, boolean estACheval) {
        super(nom, niveauVie);
        this.estACheval = estACheval;
    }

    // Setter pour estACheval
    public void setEstACheval(boolean estACheval) {
        this.estACheval = estACheval;
    }
}