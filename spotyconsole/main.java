/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spotyconsole;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alexg
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GestorMusica g = new GestorMusica("jdbc:sqlite:spoty.db");
        int opcio = 0;

        do {
            System.out.println("=== SPOTY CONSOLE ===");
            ArrayList<Playlist> llistes = g.getPlaylists();
            for (Playlist p : llistes) {
                System.out.println(p.getId() + ". " + p.getName());
            }
            System.out.println("99. [+ Nova Playlist] | 0. Sortir");
            System.out.print("Escull: ");
            opcio = in.nextInt();
            if (opcio == 99) {
                in.nextLine();
                System.out.print("Nom: ");
                String nom = in.nextLine();
                g.createPlaylist(nom);

            } else {
                Playlist p = g.getPlaylistComplete(opcio);
                if (p != null) {
                    System.out.println("\n--- " + p.getName() + " ---");
                    ArrayList<Song> songs = p.getSongs();
                    for (Song s : songs) {
                        System.out.println(s.toString());
                    }
                    System.out.print("1. Afegir cançó | 0. Tornar:");
                    int subopcio = in.nextInt();
                    if (subopcio == 1) {
                        in.nextLine();
                        System.out.print("Cerca el nom o l'artista:");
                        String text = in.nextLine();

                        ArrayList<Song> arraySongs = g.searchSongs(text);

                        if (arraySongs.isEmpty()) {
                            System.out.println("X No s'ha trobat la cançó.");
                        } else {
                            for (Song s : arraySongs) {
                                System.out.println(s.toString());
                            }
                            System.out.print("Introdueix l'ID de la cançó a afegir: ");
                            int idCanco = in.nextInt();
                            
                            if(g.addSongToPlaylist(p.getId(), idCanco)){
                                System.out.println("Canço afegida amb éxit!");
                            } else {
                                System.out.println("No s'ha afegit la canço");
                            }
                        }
                    }
                }
            }

        } while (opcio != 0);

    }

}
