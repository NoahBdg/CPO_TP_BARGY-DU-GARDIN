/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_bargy_du_gardin_version_console;

public class CelluleLumineuse {
    private boolean etat;

    public CelluleLumineuse() {
        etat = false;
    }

    // Méthode pour activer ou éteindre la cellule lumineuse en inversant son état
    public void activerCellule() {
        etat = !etat;
    }

    // Méthode pour éteindre la cellule en la mettant dans l'état "éteinte" (false)
    public void eteindreCellule() {
        etat = false;
    }

    // Méthode pour vérifier si la cellule est éteinte
    public boolean estEteint() {
        return !etat;
    }

    // Méthode pour obtenir l'état actuel de la cellule (true si allumée, false sinon)
    public boolean getEtat() {
        return etat;
    }

    // Redéfinition de la méthode toString pour afficher l'état de la cellule de manière lisible
    @Override
    public String toString() {
        // Si la cellule est allumée, affiche "X", sinon affiche "O"
        return etat ? "X" : "O";
    }}

    

