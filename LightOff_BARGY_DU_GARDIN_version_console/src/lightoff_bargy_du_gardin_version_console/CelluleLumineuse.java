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

    public void activerCellule() {
        etat = !etat;
    }

    public void eteindreCellule() {
        etat = false;
    }

    public boolean estEteint() {
        return !etat;
    }

    public boolean getEtat() {
        return etat;
    }

    @Override
    public String toString() {
        return etat ? "X" : "O";
    }
}
