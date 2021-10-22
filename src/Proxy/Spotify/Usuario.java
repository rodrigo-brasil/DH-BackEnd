package Proxy.Spotify;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    String nome;
    private boolean isPremium = false;
    private IDownload downloader ;

    private List<String> offlinePlaylist = new ArrayList<>();

    public Usuario(String nome, Boolean isPremium) {
        this.nome = nome;
        this.isPremium = isPremium;
        downloader = new Proxy(this);
    }

    public void salvarMusicaOffline(String musica){
      String download =  downloader.download(musica);
      if(download != null)
          offlinePlaylist.add(download);
    }

    public boolean isPremium() {
        return isPremium;
    }
}
