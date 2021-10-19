package Facade.Ecommerce;



import Facade.Ecommerce.model.Cartao;
import Facade.Ecommerce.model.Endereco;
import Facade.Ecommerce.model.Produto;
import Facade.Ecommerce.service.ICompraService;
import Facade.Ecommerce.service.impl.ArmazemService;
import Facade.Ecommerce.service.impl.CompraService;
import Facade.Ecommerce.service.impl.EnvioService;
import Facade.Ecommerce.service.impl.PgtoService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Produto produtoUm = new Produto("1",5,1000,"Mouse");
        Produto produtoDois = new Produto("2",5,3000,"Teclado");
        Cartao cartao = new Cartao("1111222233334444","012","2025/07/09");

        Endereco endereco = new Endereco("Av Morumbi","1500","14280000","Morumbi","São Paulo");
        ICompraService compraService = new CompraService(new ArmazemService(Arrays.asList(produtoUm,produtoDois)),new PgtoService(),new EnvioService());

        compraService.processarCompra("1",3, cartao, endereco);

    }
}
