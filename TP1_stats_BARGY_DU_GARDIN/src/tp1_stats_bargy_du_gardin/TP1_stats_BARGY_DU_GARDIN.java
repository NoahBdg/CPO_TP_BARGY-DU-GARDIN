/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_bargy_du_gardin;

import java.util.Scanner;

/**
 *
 * @author Noah
 */

import java.util.Random;

public class TP1_stats_BARGY_DU_GARDIN {

    public static void main(String[] args) {
        int tab[] = new int[6];
        // Initialiser le générateur de nombres aléatoires
        Random random = new Random();
        
        // Définir le nombre d'itérations
        int m = 100; // Vous pouvez changer ce nombre selon votre besoin
        
        // Boucle de m itérations
        for (int i = 0; i < m; i++) {
            // Tirer un nombre aléatoire entre 0 et 5 (inclus)
            int nombreAleatoire = random.nextInt(6);
            
            // Incrémenter la case d'indice correspondante dans le tableau
            tab[nombreAleatoire]++;
        }
        
        // Afficher le tableau des occurrences sous forme de pourcentages
        System.out.println("Occurrences des nombres de 0 a 5 apres " + m + " iterations :");
        for (int i = 0; i < tab.length; i++) {
            double pourcentage = (double) tab[i] / m * 100;
            System.out.println("Nombre " + i + " : " + pourcentage + "%");
        }
    }
}
