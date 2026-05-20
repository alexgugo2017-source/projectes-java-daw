/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jardi;

/**
 *
 * @author alexg
 */
public class Declius extends Planta {
    public Declius(){
        super.altura = 1;
        super.esViva = true;
    }

    private boolean tocaCreixer = false;

    @Override
    public char getChar(int pos) {
        if (pos == this.altura -1 ) {
            return '*';
        }
        if (pos < super.altura -1 && pos >= 0 ) {
            return ':';
        }
        return ' ';
    }

    @Override
    public Llavor creix() {
        this.tocaCreixer = !tocaCreixer;
        if (tocaCreixer) {
            if (super.altura > 4) {
                super.altura--;

            } else {
                altura++;
            }

        }
        if (super.altura <= 0) {
            super.esViva = false;
        }
        if (this.altura == 4 && this.tocaCreixer) {
            return new Llavor(new Declius());
        }
        return null;

    }
}
