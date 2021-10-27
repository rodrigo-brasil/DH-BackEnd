package Log4j.Pratica;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        BasicConfigurator.configure();

        Leao leao = new Leao("Simba ", -5, true);
        leao.correr();
        try {
            leao.eMaiorQue10();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        Leao leao1 = new Leao("Simba ", 15, true);
        leao1.correr();
        try {
            leao1.eMaiorQue10();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        Tigre tigre = new Tigre("Tigrão", -5);
        tigre.correr();
        try {
            tigre.eMaiorQue10();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

}
