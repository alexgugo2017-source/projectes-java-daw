/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fabricadenaus;

import java.util.ArrayList;

/**
 *
 * @author alexg
 */
public class ComponentSimple extends ComponentNau {

    public ComponentSimple(String nom, int pes) {
        super(nom, pes);
    }

    @Override
    public void add(ComponentNau c) {
        throw new UnsupportedOperationException("No puc tenir fills"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(ComponentNau c) {
        throw new UnsupportedOperationException("No puc tenir fills"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<ComponentNau> getComponents() {
        return null;
    }

    @Override
    public String descriu() {
        return descriu("");
    }

    @Override
    public String descriu(String prefix) {
        return prefix + this.toString() + "\n";
    }

}
