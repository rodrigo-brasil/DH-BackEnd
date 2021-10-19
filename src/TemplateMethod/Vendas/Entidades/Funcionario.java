package TemplateMethod.Vendas.Entidades;

public class Funcionario extends Vendedor {

    private int anos;

    public Funcionario(String nome) {
        super(nome, "Vendedor");
        anos = 0;
    }

    public void addAnos() {
        anos++;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public void obterAfiliado() {
        pontos += 10;
    }

    @Override
    public void vender() {
        super.vender();
        pontos += 5 + (anos * 5);
    }
}
