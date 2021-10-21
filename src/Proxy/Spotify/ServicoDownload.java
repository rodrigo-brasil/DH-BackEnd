package Proxy.Spotify;

public class ServicoDownload implements  IDownload{

    @Override
    public String download(String musica) {
        // usa api do serviço pra pegar a musica, se não exitir musica com o nome retorna null
        return musica;
    }
}
