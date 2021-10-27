package Log4j.Pratica;

import org.apache.log4j.Logger;

public class Leao {

    private static final Logger logger = Logger.getLogger(Leao.class);

    private String nome;
    private int idade;
    private boolean isAlpha;

    public Leao(String nome, int idade, boolean isAlpha) {
        this.nome = nome;
        this.idade = idade;
        this.isAlpha = isAlpha;
    }

    public void correr(){
        logger.info("O leão "+ nome + " está correndo!");
    }

    public void eMaiorQue10() throws Exception {
       if(idade > 10 && this.isAlpha){
           logger.info("O leão "+ nome + " tem mais de 10 anos");
       }
       if(idade < 0)
           throw new Exception("A idade não pode ser negativa");
    }
}
