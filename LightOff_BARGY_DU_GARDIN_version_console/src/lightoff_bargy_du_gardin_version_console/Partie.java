/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_bargy_du_gardin_version_console;

import java.util.Scanner;

/**
 *
 * @author lebgd
 */

public class Partie {
    private GrilleDeJeu grille;
    private int nbCoups;

    public Partie(int nbLignes, int nbColonnes, int nbTours) {
        grille = new GrilleDeJeu(nbLignes, nbColonnes);
        nbCoups = 0;
        grille.melangerMatriceAleatoirement(10); 
    }

    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10); // Mélangez la grille pour assurer une solution réalisable
    }

    public void lancerPartie() {
        initialiserPartie();
        Scanner scanner = new Scanner(System.in);

        System.out.println("ET C'EST PARTIE POUR DU LIGHTOFF");
        System.out.println("Voici ta grille de départ :");
        System.out.println(grille);

        while (!grille.cellulesToutesEteintes()) {
            System.out.print("Entre ton coup  : ");
            int coup = scanner.nextInt();

            if (coup >= 0 && coup < grille.nbLignes) {
                grille.activerLigneDeCellules(coup);
            } else if (coup >= grille.nbLignes && coup < grille.nbLignes + grille.nbColonnes) {
                grille.activerColonneDeCellules(coup - grille.nbLignes);
            } else {
                System.out.println("Hop pas si vite petit filou. Veuillez entrer un nombre entre 0 et " + (grille.nbLignes + grille.nbColonnes - 1));
                continue;
            }

            nbCoups++;
            System.out.println("Nombre de coups joués : " + nbCoups);
            System.out.println("Etat de la grille :");
            System.out.println(grille);
        }

        System.out.println("Bravo ! Tu as eteint toutes les cellules en " + nbCoups + " coups. Essai de faire mieux la prochaine fois");
        scanner.close();
    }


}


