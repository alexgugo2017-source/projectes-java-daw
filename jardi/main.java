/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jardi;

import java.util.Scanner;

/**
 *
 * @author alexg
 */
public class main {

    public static void main(String[] args) {
        Jardi miJardin = new Jardi(20);
        Scanner sc = new Scanner(System.in);
        String entrada = "";

        // 2. Plantamos las plantas iniciales
        // Usamos el método que añadimos antes en la clase Jardi
        miJardin.plantaLlavor(new Altibius(), 5);
        miJardin.plantaLlavor(new Declius(),15);

        System.out.println("===== SIMULACIÓ DEL JARDÍ VIRTUAL =====");
        System.out.println("Instruccions:");
        System.out.println("- Prem ENTER per avançar 1 unitat de temps.");
        System.out.println("- Escriu 'surt' per acabar el programa.");
        System.out.println("=======================================\n");

        // 3. Bucle principal de la simulación
        while (!entrada.equalsIgnoreCase("surt")) {
            
            // Dibujamos el jardín llamando al toString()
            System.out.println(miJardin.toString());

            System.out.print("Temps? > ");
            entrada = sc.nextLine();

            if (!entrada.equalsIgnoreCase("surt")) {
                // Hacemos que pase el tiempo (crecer, reproducirse, morir)
                miJardin.temps();
                
                // Un poco de espacio para que se vea el movimiento
                System.out.println("\n\n\n\n"); 
                System.out.println("--- El temps avança... ---");
            }
        }

        System.out.println("Gràcies per cuidar el jardí. Adéu!");
        sc.close();
    }
    
    
}
