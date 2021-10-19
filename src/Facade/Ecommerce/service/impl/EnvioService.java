package Facade.Ecommerce.service.impl;



import Facade.Ecommerce.model.Endereco;
import Facade.Ecommerce.model.Produto;

import java.util.List;

public class EnvioService {

    public void processarEnvio(List<Produto> produtos, Endereco endereco){
        System.out.println("Enviando produtos a " + endereco.getRua() +" "+ endereco.getNro() +","+ endereco.getBairro());
    }
}
