/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author lebgd
 */
    public class Epee extends Arme {
    private int finesse;

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        if (finesse >= 0 && finesse < 100) {
            this.finesse = finesse;
        } else {
            throw new IllegalArgumentException("L'indice de finesse de l'épée doit être compris entre 0 et 99.");
        }
    }

    public int getFinesse() {
        return finesse;
    }

    @Override
    public String toString() {
        return "Epee{" +
               "nom='" + nom + '\'' +
               ", niveauAttaque=" + getNiveauAttaque() +
               ", finesse=" + finesse +
               '}';
    }
}
