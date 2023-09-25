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
                System.out.println("Please enter the operator:");
        int operateur = scanner.nextInt();
        scanner.close();
        System.out.println("1) add");
        System.out.println("2) subtract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        System.out.print("Veuillez entrer la première valeur (opérande1) : ");
        double operande1 = scanner.nextDouble();
        scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer la première valeur (opérande1) : ");
        double operande2 = scanner.nextDouble();
        
    }
    
}