/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_bargy_du_gardin;

import java.util.Scanner;

/**
 *
 * @author lebgd
 */
public class TP1_manipNombresInt_BARGY_DU_GARDIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrez le premier nombre puis le deuxieme:");
        int nb1 = scanner.nextInt();
        int nb2= scanner.nextInt();
        System.out.println("Voila la somme de tes deux nombres: "+ (nb1+nb2));
        System.out.println("Voila le produit de tes deux nombres: "+ (nb1*nb2));
        System.out.println("Voila la différence de tes deux nombres: "+ (nb1-nb2));
        System.out.println("Voila le quotient entier de tes deux nombres: "+ (nb1/nb2));
        System.out.println("Voila le reste de la division de tes deux nombres: "+ (nb1%nb2));
    }
    
}
