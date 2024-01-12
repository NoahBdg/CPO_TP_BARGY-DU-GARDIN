/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author lebgd
 */
public abstract class Arme {
    public String nom;
    private int niveauAttaque;

    // Constructeur
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        // Vérification que le niveau d'attaque est compris entre 0 et 100
        if (niveauAttaque >= 0 && niveauAttaque <= 100) {
            this.niveauAttaque = niveauAttaque;
        } else {
            // Si le niveau d'attaque est invalide, attribuer une valeur par défaut (par exemple, 0)
            this.niveauAttaque = 0;
            System.out.println("Niveau d'attaque invalide. La valeur par défaut (0) a été attribuée.");
        }
    }

    // Méthode pour obtenir le niveau d'attaque
    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    // Redéfinition de la méthode toString pour afficher le nom et le niveau d'attaque
    @Override
    public String toString() {
        return "Arme{" +
                "nom='" + nom + '\'' +
                ", niveauAttaque=" + niveauAttaque +
                '}';
    }
}
