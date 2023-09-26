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
        System.out.print("Veuillez saisir une valeur réelle (type double) : ");

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
public static void menu(String[] args) {
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

        switch (choix) {
            case 1:
                double celsiusVersKelvin = CelciusVersKelvin(valeur);
                System.out.println(valeur + " degré celcius est égal à " + celsiusVersKelvin + " degrés kelvin.");
                break;

            case 2:
                double KelvinVersCelcius = KelvinVersCelcius(valeur);
                System.out.println(valeur + " degré Kelvin est égal à " + KelvinVersCelcius + " degrés Celsius.");
                break;
            case 3:
                double farenheitVersCelcius = KelvinVersCelcius(valeur);
                System.out.println(valeur + " degré Kelvin est égal à " + KelvinVersCelcius(t) + " degrés Celsius.");
                break;
            case 4:
                double farenheitVersCelcius = KelvinVersCelcius(valeur);
                System.out.println(valeur + " degré Kelvin est égal à " + KelvinVersCelcius(t) + " degrés Celsius.");
                break;
            case 5:
                double farenheitVersCelcius = KelvinVersCelcius(valeur);
                System.out.println(valeur + " degré Kelvin est égal à " + KelvinVersCelcius(t) + " degrés Celsius.");
                break;
            
            
            default:
                System.out.println("Choix invalide.");
        }

        scanner.close();
    }
}