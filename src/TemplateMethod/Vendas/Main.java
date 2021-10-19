package TemplateMethod.Vendas;

import TemplateMethod.Vendas.Entidades.Afiliados;
import TemplateMethod.Vendas.Entidades.Estagiario;
import TemplateMethod.Vendas.Entidades.Funcionario;
import TemplateMethod.Vendas.Entidades.Vendedor;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Rodrigo");
        Vendedor afiliado = new Afiliados("João");
        Vendedor estagiario = new Estagiario("felipe");

        afiliado.vender();

        funcionario.setAnos(5);
        funcionario.obterAfiliado();
        funcionario.vender();

        estagiario.vender();


        afiliado.mostrarCategoria();
        funcionario.mostrarCategoria();
        estagiario.mostrarCategoria();
    }
}
