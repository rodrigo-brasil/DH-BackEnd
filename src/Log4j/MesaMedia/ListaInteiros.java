package Log4j.MesaMedia;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ListaInteiros {

    private static final Logger logger = Logger.getLogger(ListaInteiros.class);

    private List<Integer> listaInteiros = new ArrayList<>();

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

        double media = 0;
        for (int numero : listaInteiros) {
            media += numero;
        }
        media = media / listaInteiros.size();

        logger.info("Média é igual " + media);
    }


}
