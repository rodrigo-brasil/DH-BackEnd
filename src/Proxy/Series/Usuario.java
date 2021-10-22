package Proxy.Series;

import Proxy.Series.SerieProxy;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

   private   List<SerieProxy> seriesCache = new ArrayList<>();

    public void verSerie(String nome) {

            SerieProxy proxy = seriesCache.stream().filter(serie -> serie.getSerieNome().equalsIgnoreCase(nome)).findFirst().orElse(null);
            if(proxy != null) {
                try {
                    String link = proxy.getLinkSerie();
                    System.out.println(link);
                } catch (SerieNaoHabilitadaException e) {
                    System.out.println(e);
                }
            }
        else {
            SerieProxy nova = new SerieProxy(nome);
            seriesCache.add(nova);
            try {
                String link =nova.getLinkSerie();
                System.out.println( link);
            }catch (SerieNaoHabilitadaException e){
                System.out.println(e.toString());
            }
        }
    }
}
