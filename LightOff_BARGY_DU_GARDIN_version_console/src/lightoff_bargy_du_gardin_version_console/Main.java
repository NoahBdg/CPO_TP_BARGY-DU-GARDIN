package lightoff_bargy_du_gardin_version_console;

import java.util.Scanner;




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Choix du nombres de lignes et colonnes
        System.out.print("Entrez le nombre de lignes de la grille : ");
        int nbLignes = scanner.nextInt();
        System.out.print("Entrez le nombre de colonnes de la grille : ");
        int nbColonnes = scanner.nextInt();

        // Choix du niveau de difficulté
        System.out.print("Choisissez un niveau de difficulté (facile, moyen, difficile) : ");
        String niveauDifficulte = scanner.next().toLowerCase();

        int nbTours = 0;
        switch (niveauDifficulte) {
            case "facile" -> nbTours = 5;
            case "moyen" -> nbTours = 10;
            case "difficile" -> nbTours = 15;
            default -> {
                System.out.println("Niveau de difficulté non valide. Le jeu sera configuré en mode moyen.");
                nbTours = 10;
            }
        }

        // Création d'une partie
        Partie partie = new Partie(nbLignes, nbColonnes, nbTours);

        // Lancement de la partie
        partie.lancerPartie();

        scanner.close();
    }
}

    
    


    
    
