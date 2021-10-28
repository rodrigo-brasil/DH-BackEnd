package Log4j.MesaMedia;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaInteiros {

    private static final Logger logger = Logger.getLogger(ListaInteiros.class);

    private List<Integer> listaInteiros = new ArrayList<>();

    public ListaInteiros(int ...numeros) {
        Arrays.stream(numeros).forEach(numero -> listaInteiros.add(numero));
    }

    public void add(int numero) {
        listaInteiros.add(numero);
        if (listaInteiros.size() > 10) {
            logger.info("O comprimento da lista é maior que 10");
        }
        else if (listaInteiros.size() > 5) {
            logger.info("O comprimento da lista é maior que 5");
        }
    }

    public void calcularMedia() throws Exception {
        if (listaInteiros.size() <= 0)
            throw new Exception("Lista vazia");

        Double media = listaInteiros.stream().mapToDouble(Integer::doubleValue).average().orElse(0);

        logger.info("Média é igual " + media);
    }


}
