package Flyweight.Roupas;

import java.util.ArrayList;
import java.util.List;

public class RoupaFactory {
    private static List<Roupa> lista = new ArrayList<>();

    public static Roupa getRoupa(String tamanho, String tipo, boolean eNova, boolean importado) {
        Roupa roupa = lista.stream().filter(roupa1 -> roupa1.equals(new Roupa(tamanho, tipo, eNova, importado))).findFirst().orElse(null);
        if (roupa == null) {
            roupa = new Roupa(tamanho, tipo, eNova, importado);
            lista.add(roupa);
        }
        return roupa;
    }

    public static int getQtd(){
        return lista.size();
    }

}
