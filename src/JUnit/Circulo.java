package JUnit;

public class Circulo extends Figura{
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * 3.14 * raio;
    }
}
