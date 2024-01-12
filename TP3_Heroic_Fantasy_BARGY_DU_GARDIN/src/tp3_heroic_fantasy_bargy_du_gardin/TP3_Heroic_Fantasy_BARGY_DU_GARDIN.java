/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_bargy_du_gardin;

import Personnages.Magicien;
import Personnages.Personnage;
import Personnages.Guerrier;
import Armes.Baton;
import Armes.Epee;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author lebgd
 */
public class TP3_Heroic_Fantasy_BARGY_DU_GARDIN {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        Epee Excalibur= new Epee("Excalibur",7,5);
        Epee Durandal=new Epee("Durandal",4,7);
        Baton Chene= new Baton("Chêne",4,5);
        Baton Charme= new Baton("Charme",4,5);
        ArrayList<Arme> l = new ArrayList<Arme>();
        l.add(Excalibur);
        l.add(Durandal);
        l.add(Charme);
        l.add(Chene);
        for (int i = 0; i < l.size(); i++) {
            Arme arme = l.get(i);
            System.out.println("Arme " + (i + 1) + ": " + arme.toString());
        }
        Magicien Gandalf=new Magicien("Gandalf",65,true);
        Magicien Garcimore=new Magicien("Garcimore",44,false);
        Guerrier Lannister= new Guerrier("Lannister",45,true);
        Guerrier Conan=new Guerrier("Conan",78,false);
        ArrayList<Personnage> T =new ArrayList<Personnage>();
        T.add(Conan);
        T.add(Gandalf);
        T.add(Garcimore);
        T.add(Lannister);
        
        
        for(int i=0;i<T.size();i++){
            Personnage p=T.get(i);
            System.out.print(p.toString());
    
}
    }}