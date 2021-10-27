package Log4j.Pratica;

import org.apache.log4j.Logger;

public class Tigre {

    private static final Logger logger = Logger.getLogger(Tigre.class);

    private String nome;
    private int idade;

    public Tigre(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void correr(){
        logger.info("O Tigre "+ nome + " está correndo!");
    }

    public void eMaiorQue10() throws Exception {
        if(idade > 10){
            logger.info("O Tigre "+ nome + " tem mais de 10 anos");
        }
        if(idade < 0)
            throw new Exception("Idade inferior a 0");
    }
}
