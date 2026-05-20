/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jardi;

/**
 *
 * @author alexg
 */
public class Jardi {

    public static final int ALTURA_JARDI = 10;
    private Planta[] jardi;
    private String terra;

    public Jardi(int mida) {
        if (mida < 0) {
            mida = 10;
        }
        this.jardi = new Planta[mida];

    }

    public void temps() {
        Planta res;
        for (int i = 0; i < jardi.length; i++) {
            if (jardi[i] != null) {
                res = jardi[i].creix();

                if (res instanceof Llavor) {
                    int salt = jardi[i].escamparLlavor();
                    int desti = i + salt;

                    if (jardi[desti] != null && desti > 0 && desti <= jardi.length - 1) {
                        jardi[desti] = res;
                    }
                } else if (res instanceof Planta) {
                    jardi[i] = res;
                }
                if (jardi[i].esViva == false) {
                    jardi[i] = null;
                }
            }

        }

    }

    public boolean plantaLlavor(Planta novaPlanta, int pos) {
        if (jardi[pos] == null) {
            jardi[pos] = novaPlanta;
            return true;
        }
        return false;

    }

    public String toString() {
        String res = "";
        for (int i = ALTURA_JARDI; i >= 0; i--) {

            for (int j = 0; j < jardi.length; j++) {
                if (jardi[j] == null) {
                    res += " ";
                } else {
                    res += jardi[j].getChar(i);
                    
                }
            }
            res += "\n";

        }
        for (int i = 0; i < jardi.length; i++) {
            res += "_";
        }
        return res;

    }
}
