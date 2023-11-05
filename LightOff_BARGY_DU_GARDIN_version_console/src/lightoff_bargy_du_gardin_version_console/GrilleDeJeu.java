package lightoff_bargy_du_gardin_version_console;


import java.util.Random;

public class GrilleDeJeu {
    private CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;

    public GrilleDeJeu(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int choix = random.nextInt(3);

        switch (choix) {
            case 0:
                activerLigneDeCellules(random.nextInt(nbLignes));
                break;
            case 1:
                activerColonneDeCellules(random.nextInt(nbColonnes));
                break;
            case 2:
                activerDiagonaleDescendante();
                break;
            default:
                break;
        }
    }

    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules();

        Random random = new Random();
        for (int tour = 0; tour < nbTours; tour++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    public void activerLigneDeCellules(int idLigne) {
    if (idLigne >= 0 && idLigne < nbLignes) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }
}

    public void activerColonneDeCellules(int idColonne) {
    if (idColonne >= 0 && idColonne < nbColonnes) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }}

    public void activerDiagonaleDescendante() {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    public void activerDiagonaleMontante() {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][nbColonnes - 1 - i].activerCellule();
        }
    }

    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].getEtat()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
    StringBuilder grilleString = new StringBuilder();
    grilleString.append(" |");
    for (int j = 0; j < nbColonnes; j++) {
        grilleString.append(" ").append(j).append(" |");
    }
    grilleString.append("\n");
    grilleString.append("-".repeat((nbColonnes + 1) * 4)).append("\n");

    for (int i = 0; i < nbLignes; i++) {
        grilleString.append(i).append("|");
        for (int j = 0; j < nbColonnes; j++) {
            grilleString.append(" ").append(matriceCellules[i][j].getEtat() ? "X" : "O").append(" |");
        }
        grilleString.append("\n");
        grilleString.append("-".repeat((nbColonnes + 1) * 4)).append("\n");
    }
    return grilleString.toString();
}}
