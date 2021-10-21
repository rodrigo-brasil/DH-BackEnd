package Proxy.Spotify;

public class Proxy implements IDownload {
    private ServicoDownload servico = new ServicoDownload();
    private Usuario usuario;

    public Proxy(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String download(String musica) {
        if (usuario.isPremium()){
            System.out.println(musica + " download completo");
            return servico.download(musica);
        }
        else{
            System.out.println("Download de músicas são para usuários premiums");
            return null;
        }
    }
}
