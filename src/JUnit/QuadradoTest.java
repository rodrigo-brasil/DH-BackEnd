package JUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {
    Quadrado quadrado;
    @BeforeEach
    void setUp() {
        quadrado = new Quadrado(4);
    }

    @Test
    void calcularPerimetro() {
        assertEquals(16, quadrado.calcularPerimetro());
    }
}