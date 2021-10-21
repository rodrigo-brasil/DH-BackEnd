package Proxy.Spotify;

public class Proxy implements IDownload {
    private ServicoDownload servico = new ServicoDownload();
    private Usuario usuario;

    public Proxy(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String download(String musica) {
        if (usuario.isPremium()) {
            String donwload = servico.download(musica);
            if (donwload == null) {
                System.out.println("Música não encontrada!");
                return null;
            }
            System.out.println(musica + " download completo");
            return donwload;
        } else {
            System.out.println("Download de músicas são para usuários premiums");
            return null;
        }
    }
}
