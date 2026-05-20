package spotyconsole;

import java.util.ArrayList;


public class Playlist {
    protected int id;
    protected String name;
    protected ArrayList <Song> songs;
    
    public Playlist(int id, String name){
        this.id = id;
        this.name = name;
        songs = new ArrayList<>();
                
    }
    
    public void addSong(Song s) {
        getSongs().add(s);
    }
    
    public void show(){
        System.out.println(getSongs().toString());
    }
    
    public void setName(String name){
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the songs
     */
    public ArrayList <Song> getSongs() {
        return songs;
    }
}
