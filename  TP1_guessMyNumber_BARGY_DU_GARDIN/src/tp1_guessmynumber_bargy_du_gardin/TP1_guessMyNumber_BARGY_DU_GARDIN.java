/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_bargy_du_gardin;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author noah
 */
public class TP1_guessMyNumber_BARGY_DU_GARDIN {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Choisissez le niveau de difficulté :");
            System.out.println("1. Facile (plage de nombres : 1-50, tentatives illimitées)");
            System.out.println("2. Normal (plage de nombres : 1-100, 10 tentatives)");
            System.out.println("3. Difficile (plage de nombres : 1-1000, 5 tentatives)");
            int choix = scanner.nextInt();
            
            int maxNumber;
            int maxTries;
            
            // Configurer les règles du jeu en fonction du niveau de difficulté choisi
            switch (choix) {
                case 1 -> {
                    maxNumber = 50;
                    maxTries = Integer.MAX_VALUE; // Tentatives illimitées
                }
                case 2 -> {
                    maxNumber = 100;
                    maxTries = 10;
                }
                case 3 -> {
                    maxNumber = 1000;
                    maxTries = 5;
                }
                default -> {
                    System.out.println("Niveau de difficulté invalide. Choisissez parmi 1, 2 ou 3.");
                    return;
                }
            }
            
            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(maxNumber) + 1;
            int compteur = 0;
            
            System.out.println("Devinez le nombre entre 1 et " + maxNumber + ".");
            
            while (compteur < maxTries) {
                int valeur = scanner.nextInt();
                compteur++;
                
                if (valeur < 1 || valeur > maxNumber) {
                    System.out.println("Veuillez entrer un nombre entre 1 et " + maxNumber + ".");
                } else if (valeur < n) {
                    System.out.println("Trop petit. Essayez encore.");
                } else if (valeur > n) {
                    System.out.println("Trop grand. Essayez encore.");
                } else {
                    System.out.println("Bravo, vous avez deviné le nombre en " + compteur + " essais !");
                    break;
                }
            }
            
            if (compteur >= maxTries) {
                System.out.println("Désolé, vous avez atteint le nombre maximum d'essais. Le nombre était : " + n);
            }
        }
    }
}
