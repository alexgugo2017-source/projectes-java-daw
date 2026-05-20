/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fabricadenaus;

/**
 *
 * @author alexg
 */
public class Habitacle extends ComponentSimple {

    private int habitantsMax;

    public Habitacle(String nom, int pes, int habitantsMax) {
        super(nom, pes);
        this.habitantsMax = habitantsMax;
    }

    @Override
    public String toString() {
        return "Nom:" + super.nom + "Habitants maxims:" + this.habitantsMax + "Pes: " + super.pes;
    }

}
