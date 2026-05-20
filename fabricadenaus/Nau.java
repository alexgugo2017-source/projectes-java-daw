/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fabricadenaus;

/**
 *
 * @author alexg
 */
public class Nau extends ComponentComport{
    
    public Nau(String nom, int pes, int capacitat) {
        super(nom, pes, capacitat);
    }
    
    @Override
    public void add(ComponentNau c) {
        if (c instanceof Nau) {
            throw new IllegalArgumentException("No es pot afegir una Nau dins d'una nau");
        }
        super.add(c);
    }
    
    @Override
    public String toString(){
        return "Nom:" + super.nom + "Capacitat: " + super.capacitat + "Pes: " + super.pes;
    }
    
}
