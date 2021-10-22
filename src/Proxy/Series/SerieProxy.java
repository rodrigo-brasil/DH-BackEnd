package Proxy.Series;

public class SerieProxy implements ISerie {
    private int qtdViews = 0;
    private Serie serie;


    public SerieProxy(String serie) {
        this.serie = new Serie(serie);
    }

    public String getSerieNome() {
        return serie.getNome();
    }

    @Override
    public String getLinkSerie() throws SerieNaoHabilitadaException {
        qtdViews++;
        if (qtdViews <= 5) {
            return serie.getLinkSerie();
        } else {
            throw new SerieNaoHabilitadaException(getSerieNome() + " Excede o número de reproduções permitidas");
        }

    }
}
