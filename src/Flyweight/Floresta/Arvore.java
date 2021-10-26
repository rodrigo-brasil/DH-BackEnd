package Flyweight.Floresta;

public class Arvore {
    ArvoreTipo tipo;
    private int altura;
    private int largura;

    public Arvore(ArvoreTipo tipo,  int altura, int largura) {
        this.tipo = tipo;
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public String toString() {
        String cor = tipo.getCor().substring(0,1) ;
        return  cor;
    }
}
