/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jardi;

/**
 *
 * @author alexg
 */
public class Llavor extends Planta{
    private Planta planta;
    private int temps;
    
    public Llavor(Planta p) {
        super.altura = 0;
        super.esViva = true;
        this.temps = 0;
        this.planta = p;
        if (p instanceof Llavor) {
            throw new IllegalArgumentException("Una llavor no pot produir una altra llavor");
            
        }
    }
    
    @Override
    public Planta creix(){
        temps++;
        if (temps == 5) {
            return planta;
        }
        return null;
    }

    @Override
    public char getChar(int pos) {
        if (pos == 0) {
            return '.';
        }
        return ' ';
    }
    
}
