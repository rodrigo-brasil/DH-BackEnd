package TemplateMethod.Vendas.Entidades;

public abstract class Vendedor {
    protected String nome;
    protected String tipo;
    protected int pontos = 0;

    public Vendedor(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void mostrarCategoria() {
        String categoria = "novato";
        if (pontos >= 20 && pontos <= 30)
            categoria = "aprendiz";
        else if (pontos >= 31 && pontos <= 40)
            categoria = "bom";
        else if (pontos > 40)
            categoria = "mestre";
        System.out.printf("%s tem um total de %d pontos e categoriza como %s %s \n", nome, pontos,tipo ,categoria);
    }

    public void vender() {
    }

}

