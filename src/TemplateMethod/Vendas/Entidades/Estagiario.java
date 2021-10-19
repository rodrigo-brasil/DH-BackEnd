package TemplateMethod.Vendas.Entidades;

public class Estagiario extends  Vendedor{
    public Estagiario(String nome) {
        super(nome,"Estagiário");
    }

    @Override
    public void vender() {
        super.vender();
        pontos+=5;
    }

    @Override
    public void mostrarCategoria() {
        String categoria = pontos < 50 ? "novato": "experiente";
        System.out.printf("%s tem um total de %d pontos e categoriza como %s %s \n", nome, pontos,tipo ,categoria);
    }
}
