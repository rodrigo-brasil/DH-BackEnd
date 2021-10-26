package Flyweight.Floresta;

public class ArvoreTipo {
   private String tipo;
   private String cor;


    public ArvoreTipo(String tipo, String cor) {
        this.tipo = tipo;
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }
}
