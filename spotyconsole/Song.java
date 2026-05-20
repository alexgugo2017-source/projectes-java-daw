package spotyconsole;

public class Song {
    private int id;
    private String title;
    private String artirst;
    
    public Song(int id, String title, String artirst) {
        this.id = id;
        this.title = title;
        this.artirst = artirst;
    }
    
    @Override
    public String toString(){
        return String.format("[%d]%s (By: %s)",id, title,artirst );
    }
}
