/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fabricadenaus;

/**
 *
 * @author alexg
 */
public class Motor extends ComponentSimple {

    public Motor(String nom, int pes, int potencia) {
        super(nom, pes);
        super.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motor" + super.nom + "potencia: " + super.potencia + "pes: " + super.pes;

    }

}
