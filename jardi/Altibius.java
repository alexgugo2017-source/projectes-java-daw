/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jardi;

/**
 *
 * @author alexg
 */
public class Altibius extends Planta{
    public Altibius(){
        super.altura = 1;
        super.esViva = true;
    }

    @Override
    public char getChar(int pos) {
        if (pos == super.altura -1) {
            return 'O';
        }
        if (pos < super.altura -1 && pos >= 0) {
            return '|';
        }
        return ' ';
    }
    
    @Override
    public Llavor creix(){
        super.altura++;
        if (super.altura> 7) {
            return new Llavor(new Altibius());
            
        }
        return null;
        
    }
    
}
