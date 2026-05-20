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
public abstract class ComponentNau {

    public ComponentNau(String nom, int pes) {
        this.nom = nom;
        this.pes = pes;

    }
    public String nom;
    protected int pes;
    protected int capacitat;
    protected int potencia;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPes() {
        return pes;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getPesTotal() {
        return pes;
    }

    public int getPotenciaTotal() {
        return potencia;
    }

    // Metodes abstractes
    public abstract void add(ComponentNau c);

    public abstract void remove(ComponentNau c);

    public abstract ArrayList<ComponentNau> getComponents();

    public abstract String descriu();

    public abstract String descriu(String prefix);

    // protected
    protected void setPes(int pes) {
        this.pes = pes;
    }

    protected void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }

    protected void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
