/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jardi;

import java.util.Random;

/**
 *
 * @author alexg
 */
public abstract class Planta {
    protected boolean esViva;
    protected int altura;
    
    public abstract char getChar(int pos);
    
    public int getAltura() {
        return altura;
    }
    
    public boolean esViva(){
        if (esViva) {
            return true;
        }
        return false;
    }
    
    public Planta creix(){
        if (altura < Jardi.ALTURA_JARDI) {
            altura++;
        } else {
            esViva = false;
        }
        return null;
        
    }
    
    public int escamparLlavor(){
        Random rnd = new Random();
        int num = 0;
        while(num == 0) {
            num = rnd.nextInt(-2, 3);
        }
        return num;
        
    }
}
