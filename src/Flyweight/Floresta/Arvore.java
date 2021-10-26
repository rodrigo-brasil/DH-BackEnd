package Flyweight.Floresta;

public class Arvore {
    private String tipo;
    private String cor;
    private int altura;
    private int largura;

    public Arvore(String tipo, String cor, int altura, int largura) {
        this.tipo = tipo;
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public String toString() {
        String cor = this.cor.substring(0, 1);
        return cor;
    }
}
