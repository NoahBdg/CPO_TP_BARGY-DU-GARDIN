/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_bargy;

/**
 *
 * @author lebgd
 */
public class Voiture {
    private String marque;
    private String modele;
    private Personne Proprietaire ;

        int puissanceCV ;

    public Voiture(String marque, String modele, int PuissanceCV) {
        this.marque = marque;
        this.modele = modele;
        this.puissanceCV = puissanceCV;

    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }
    public int getPuissanceCV() {
        return puissanceCV;
    }
   

    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + "Puissance"+ puissanceCV +
                '}';
    }
}
