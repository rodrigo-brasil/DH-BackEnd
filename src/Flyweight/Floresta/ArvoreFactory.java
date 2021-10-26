package Flyweight.Floresta;

import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {
    private static Map<String, Arvore> lista = new HashMap<>();

    public static Arvore getArvoreTipo(String tipo, String cor, int altura, int largura) {
        Arvore arvoreTipo = lista.get(tipo);
        if (arvoreTipo == null) {
            arvoreTipo = new Arvore(tipo, cor, altura, largura);
            lista.put(tipo, arvoreTipo);
        }
        return arvoreTipo;
    }

}
