/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fabricadenaus;

/**
 *
 * @author alexg
 */
public class Hangar extends ComponentComport{
    
    public Hangar(String nom, int pes, int capacitat) {
        super(nom, pes, capacitat);
    }
    
    @Override
    public void add(ComponentNau c){
        if (c instanceof Nau) {
            super.add(c);
        } else {
            throw new IllegalArgumentException("Només accepto de tipus Nau");
        }
    }
    
    @Override
    public int getPotenciaTotal(){
        return this.potencia;
    }
    @Override
    public String toString(){
        return "Nom:" + super.nom + "Capacitat: " + super.capacitat + "Pes: " + super.pes;
    }
    
}
