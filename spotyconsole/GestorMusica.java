package spotyconsole;

import java.sql.*;
import java.util.ArrayList;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author alexg
 */
public class GestorMusica {

    private String urlBD;

    public GestorMusica(String arxiu) {
        urlBD = arxiu;
    }

    public ArrayList<Playlist> getPlaylists() {

        ArrayList<Playlist> res = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(urlBD)) {
            Statement pd = con.createStatement();
            try (ResultSet rs = pd.executeQuery("select * from playlists;")) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    Playlist pl = new Playlist(id, name);
                    res.add(pl);
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }

    public Playlist getPlaylistComplete(int playlist) {
        Playlist p = null;
        try (Connection con = DriverManager.getConnection(urlBD)) {
            PreparedStatement pd = con.prepareStatement(""
                    + "SELECT p.name, s.id AS song_id, s.title, s.artist " +
                        "FROM playlists p " +
                        "LEFT JOIN playlist_songs ps ON p.id = ps.playlist_id " +
                        "LEFT JOIN songs s ON ps.song_id = s.id " +
                        "WHERE p.id = ?;");

            pd.setInt(1, playlist);

            try (ResultSet rs = pd.executeQuery()) {
                while (rs.next()) {
                    if (p == null) {
                        String name = rs.getString("name");
                        p = new Playlist(playlist, name);

                    }

                    int songId = rs.getInt("song_id");
                    if (!rs.wasNull()) {
                        Song s = new Song(songId, rs.getString("title"), rs.getString("artist"));
                        p.addSong(s);
                    }

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return p;
    }

    public ArrayList<Song> searchSongs(String text) {
        ArrayList<Song> s = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(urlBD)) {
            PreparedStatement ps = con.prepareStatement(""
                    + "select id, title, artist "
                    + "from songs "
                    + "where title like ? "
                        + "or artist like ?; ");

            ps.setString(1, "%" + text + "%");
            ps.setString(2, "%" + text + "%");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String title = rs.getString("title");
                    String artist = rs.getString("artist");
                    Song song = new Song(id, title, artist);
                    s.add(song);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return s;
    }

    public boolean addSongToPlaylist(int playlist, int songId) {
        try (Connection con = DriverManager.getConnection(urlBD)) {
            PreparedStatement ps = con.prepareStatement(""
                    + "insert into playlist_songs (playlist_id, song_id) values"
                    + "(?,?);");
            ps.setInt(1, playlist);
            ps.setInt(2, songId);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.getMessage();
            return false;
        }

    }

    public boolean createPlaylist(String name) {
        try (Connection con = DriverManager.getConnection(urlBD)) {
            PreparedStatement ps = con.prepareStatement(""
                    + "insert into playlists (name) values"
                    + "(?);");
            ps.setString(1, name);
            ps.executeUpdate();

            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }
}
