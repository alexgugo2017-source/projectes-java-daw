/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fabricadenaus;

import java.util.ArrayList;

public class ComponentComport extends ComponentNau {

    private ArrayList<ComponentNau> components;

    public ComponentComport(String nom, int pes, int capacitat) {
        super(nom, pes);
        super.capacitat = capacitat;
        components = new ArrayList<>();
    }

    @Override
    public void add(ComponentNau c) {
        if (components.size() >= capacitat) {
            throw new IllegalArgumentException("No caben més components");
        }
        components.add(c);
    }

    @Override
    public void remove(ComponentNau c) {
        components.remove(c);
    }

    @Override
    public ArrayList<ComponentNau> getComponents() {
        return new ArrayList<>();
    }

    public String descriu(String prefix) {
        StringBuilder res = new StringBuilder();

        res.append(prefix).append(this.toString()).append(" amb contingut: \n");

        for (ComponentNau c : components) {
            res.append(c.descriu()).append(prefix).append("    ");
        }
        res.append(prefix).append("Final contingut de ").append(nom).append("\n");

        return res.toString();

    }

    @Override
    public int getPesTotal() {
        int total = 0;
        total += super.getPesTotal();
        for (ComponentNau c : components) {
            total += c.getPesTotal();
        }
        return total;
    }

    @Override
    public int getPotenciaTotal() {
        int tot = super.potencia;
        for (ComponentNau c : components) {
            tot += c.getPotenciaTotal();
        }
        return tot;
    }

    @Override
    public String descriu() {
        return descriu("");
    }

}
