package Flyweight.ListaDeReproducao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PlaylistFactory {

    static HashMap<String,Playlist> lista = new HashMap<>();

    static Playlist getPlaylist(String nome){
        Playlist playlist = lista.get(nome);
        if(playlist == null){
            playlist = new Playlist();
            return  playlist;
        }
        return playlist;
    }

}
