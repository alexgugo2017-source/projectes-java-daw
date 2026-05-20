/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.fabricadenaus;

/**
 *
 * @author alexg
 */
public class main {

    public static void main(String[] args) {
        Nau nau1 = new Nau("Creuer interestel·lar Aníbal", 1000, 10);
        Hangar h1 = new Hangar("Hangar", 80, 200);
        Nau nau2 = new Nau("Una Nau Caça cicló", 75, 2);

        h1.add(nau2);
        Motor m1 = new Motor("Motor", 30, 200);
        nau2.add(m1);
        
        Habitacle hab1 = new Habitacle("Habitacle",120, 50);
        Motor mAux = new Motor("Motor Auxiliar", 50, 1500);
        Motor mPricipal = new Motor("Motor Principal", 50, 2500);
        nau1.add(h1);
        nau1.add(hab1);
        nau1.add(mAux);
        nau1.add(mPricipal);
        
        System.out.println(nau1.descriu("    "));
        
        System.out.println("Potencia total: " + nau1.getPotenciaTotal());
        System.out.println("Pes total: "+ nau1.getPesTotal());
    }
}
