package Facade.BuscaViagem;

public class FacadeViagens {
    ApiHoteis apiHoteis = new ApiHoteis();
    ApiVoos apiVoos = new ApiVoos();

    public void buscar(String dataPartida, String dataRetorno,String origem, String destino){
        apiHoteis.buscaHoteis(dataPartida,dataRetorno, destino);
        apiVoos.buscarVoos(dataPartida,dataRetorno,origem,destino);
    }
}
