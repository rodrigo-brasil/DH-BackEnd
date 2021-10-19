package TemplateMethod.Vendas.Entidades;

public class Afiliados extends Vendedor{

    public Afiliados(String nome) {
        super(nome, "Afiliado");
    }

    @Override
    public void vender() {
        super.vender();
        pontos+= 15;
    }
}
