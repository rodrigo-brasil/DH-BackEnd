package Log4j.MesaMedia;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        ListaInteiros lista = new ListaInteiros();

        try {
            lista.calcularMedia();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        lista.add(7);
        lista.add(10);

        try {
            lista.calcularMedia();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        for (int i = 0; i < 15; i++) {
            lista.add(3+i);
        }
    }
}
