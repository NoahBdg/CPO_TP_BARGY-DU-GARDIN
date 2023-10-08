    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_bargy_du_gardin;

/**
 *
 * @author lebgd
 */
public class TP2_Bieres_BARGY_DU_GARDIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
7.0 ,"Dubuisson") ;
        uneBiere.ouverte=false;
        uneBiere.lireEtiquette();
        
        BouteilleBiere Biere2 = new BouteilleBiere("Leffe",
6.6 ,"Abbaye de Leffe") ;
        Biere2.lireEtiquette();
        BouteilleBiere Biere3 = new BouteilleBiere("Licorne",
8.0 ,"Dubuisson") ;
        BouteilleBiere Biere4 = new BouteilleBiere("Chouffe",
9.0 ,"Dubuisson") ;
        BouteilleBiere Biere5 = new BouteilleBiere("Heineken",
7.0 ,"Dubuisson") ;
        Biere3.lireEtiquette();Biere4.lireEtiquette();Biere5.lireEtiquette();
    
    
    Biere5.decapsuler();Biere4.decapsuler();Biere3.decapsuler();
    System.out.println(Biere3);
    System.out.println(Biere5);
    System.out.println(Biere4);

    }
    
}
