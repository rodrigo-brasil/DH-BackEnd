package Flyweight.Floresta;

import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {
    private static Map<String, ArvoreTipo> lista = new HashMap<>();

    public  static ArvoreTipo getArvoreTipo(String tipo, String cor){
        ArvoreTipo arvoreTipo = lista.get(tipo);
        if(arvoreTipo == null){
            arvoreTipo = new ArvoreTipo(tipo,cor);
            lista.put(tipo,arvoreTipo);
            return arvoreTipo;
        }
        else
            return arvoreTipo;
    }

}
