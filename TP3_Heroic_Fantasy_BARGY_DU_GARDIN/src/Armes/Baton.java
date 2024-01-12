/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author lebgd
 */

public class Baton extends Arme {
    private int age;

    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        if (age >= 0 && age < 100) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("L'âge du bâton doit être compris entre 0 et 99.");
        }
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Baton{" +
               "nom='" + nom + '\'' +
               ", niveauAttaque=" + getNiveauAttaque() +
               ", age=" + age +
               '}';
    }
}
