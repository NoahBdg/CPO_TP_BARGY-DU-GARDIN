/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_bargy_du_gardin;

import java.util.Scanner;

/**
 *
 * @author Noah
 */
public class TP1_convertisseur_BARGY_DU_GARDIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    // Créer un objet Scanner pour la saisie de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir une valeur reelle (type double) : ");

        // Utiliser la méthode nextDouble() pour lire la valeur réelle
        double tempe = scanner.nextDouble();

        // Afficher la valeur réelle saisie
        System.out.println("Vous avez saisi : " + tempe);

        // Fermer le scanner
        scanner.close();
        double kelv=tempe+273.15;
        System.out.println("En kelvin celà fait : " + kelv);
        
}
public static double CelciusVersKelvin (double tCelcius) {
    return(tCelcius+273.15);
}
public static double KelvinVersCelcius (double tKelvin) {
    return(tKelvin-273.15);
}
public static double FarenheitVersCelcius(double tFahrenheit) {
        double celsius = (tFahrenheit - 32) * 5/9;
        return celsius;
    }
public static double CelciusVersFarenheit (double tCelcius) {
    return(tCelcius*1.8+32);
}

public static double KelvinVersFarenheit (double tKelvin) {
    return((tKelvin-273.15)*1.8+32);
}

public static double FarenheitVersKelvin (double tFarenheit) {
    return(CelciusVersKelvin(FarenheitVersCelcius(tFarenheit)));   
}
public static double menu(String[] args) {
    double resultat = 0 ;    
    Scanner scanner = new Scanner(System.in);

        System.out.println("Bonjour, saisissez une valeur :");
        double valeur = scanner.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");
        int choix = scanner.nextInt();

        if(choix==1){
            resultat=(CelciusVersKelvin(valeur));
        }
        scanner.close();
        if(choix==2){
            resultat=(KelvinVersCelcius(valeur));
        }
        if(choix==3){
            resultat=(FarenheitVersCelcius(valeur));
                }
        if (choix==4){
            resultat=(CelciusVersFarenheit(valeur));
        }
        if(choix==5){
            resultat=(KelvinVersFarenheit(valeur));
        }
        if(choix==6){
            resultat=(FarenheitVersCelcius(valeur));
        }
   return resultat;     
}
}