/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author lebgd
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Addition");
        System.out.println("2) Soustraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.println("5) Modulo");
        System.out.println("Veuillez entrer l'operation souhaitee :");

        int operateur = scanner.nextInt();
        if (operateur < 1 || operateur > 5) {
            System.out.println("Operateur non valide.");
            scanner.close();
            return; // Sort du programme si l'opérateur n'est pas valide.
        }
        
        System.out.print("Veuillez entrer la première valeur (operande1) : ");
        double operande1 = scanner.nextDouble();

        System.out.print("Veuillez entrer la deuxième valeur (operande2) : ");
        double operande2 = scanner.nextDouble();
        scanner.close();
        double resultat = 0.0;
         switch (operateur) {//
            case 1:
                resultat = operande1 + operande2;
                break;
            case 2:
                resultat = operande1 - operande2;
                break;
            case 3:
                resultat = operande1 * operande2;
                break;
            case 4:
                if (operande2 != 0) {
                    resultat = operande1 / operande2;
                } else {
                    System.out.println("Erreur : Division par zero.");
                    return; // Sort du programme si la division par zéro est détectée.
                }
                break;
            case 5:
                resultat = operande1 % operande2;
                break;      
        }
          System.out.println("Le résultat est : " + resultat);
}}