package ChainOfResponsibility.QualidadeProduto;

public class CheckQuality {

    private CheckBase checkBase  = new CheckEmbalagem();

    public CheckQuality() {
        checkBase.setNextChecker(new CheckLote()).setNextChecker(new CheckPeso());
    }

    public void check(Artigo artigo){
       if(checkBase.Check(artigo))
           System.out.printf("%s lote Aceito!\n\n",artigo.getNome());
       else
           System.out.printf("%s lote Rejeitado\n\n",artigo.getNome());
    }
}
