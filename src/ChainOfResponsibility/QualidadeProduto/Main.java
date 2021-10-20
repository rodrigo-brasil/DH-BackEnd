package ChainOfResponsibility.QualidadeProduto;

public class Main {

    public static void main(String[] args) {
        CheckQuality checker = new CheckQuality();

        checker.check(new Artigo("Camisas",2000, 1800,"saudável"));
        checker.check(new Artigo("Brinquedos",1000, 1200,"saudável"));
        checker.check(new Artigo("Cpu",1040, 1200,"quase saudável"));
        checker.check(new Artigo("Peças de carro",1040, 1200,"quebrado"));
    }
}
