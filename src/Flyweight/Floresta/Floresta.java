package Flyweight.Floresta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Floresta {
    private List<Arvore> floresta = new ArrayList<>();

    public void plantarAvore(String tipo, String cor, int altura, int largura) {
        Arvore arvore = ArvoreFactory.getArvoreTipo(tipo, cor, altura, largura);
        floresta.add(arvore);
    }

    public void printFloresta() {
        System.out.println(floresta.stream().map(Arvore::toString).collect(Collectors.joining(",")));
    }

}
