package ChainOfResponsibility.QualidadeProduto;

public class CheckEmbalagem extends CheckBase {
    @Override
    public boolean Check(Artigo artigo) {
        if (artigo.getEmbalagem().equalsIgnoreCase("saudável") || artigo.getEmbalagem().equalsIgnoreCase("quase saudável"))
            return checkNext(artigo);
        else {
            System.out.println("Embalagem com problema!");
            return false;
        }
    }
}
