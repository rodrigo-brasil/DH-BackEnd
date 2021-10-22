package Proxy.Series;

import java.util.Objects;

public class Serie implements ISerie {
    private String nome;
    private String link;

    public Serie(String nome) {
        this.nome = nome;
        link = "www."+nome+".com";
    }

    public String getNome() {
        return nome;
    }


    @Override
    public String getLinkSerie() {
        return link;
    }

}
