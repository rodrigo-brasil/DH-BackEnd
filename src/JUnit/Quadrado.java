package JUnit;

public class Quadrado extends Figura{
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado ;
    }
}
