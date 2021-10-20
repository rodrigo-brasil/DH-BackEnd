package ChainOfResponsibility.QualidadeProduto;

public class CheckPeso extends CheckBase {
    @Override
    public boolean Check(Artigo artigo) {
        if (artigo.getPeso() >= 1200 && artigo.getPeso() <= 1300)
            return checkNext(artigo);
        else {
            System.out.println("Peso inválido!");
            return false;
        }
    }
}
