package ChainOfResponsibility.QualidadeProduto;

public abstract class CheckBase{
    private CheckBase next;

    public CheckBase setNextChecker(CheckBase next) {
        this.next = next;
        return next;
    }

    public CheckBase getNextChecker() {
        return next;
    }

    public abstract boolean Check(Artigo artigo);

    protected boolean checkNext(Artigo artigo) {
        if (next == null) {
            return true;
        }
        return next.Check(artigo);
    }

}
