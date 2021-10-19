package Facade.Ecommerce.service;


import Facade.Ecommerce.model.Cartao;
import Facade.Ecommerce.model.Endereco;

public interface ICompraService {

    public void processarCompra(String produtoId, Integer quantidade, Cartao cartao, Endereco endereco);
}
