package ChainOfResponsibility.QualidadeProduto;

public class CheckLote extends CheckBase {

    @Override
    public boolean Check(Artigo artigo) {
        if (artigo.getLote() >= 1000 && artigo.getLote() <= 2000)
            return checkNext(artigo);
        else {
            System.out.println("Quantidade do lote inválido");
            return false;
        }
    }

}
