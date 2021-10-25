package JUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {
        Circulo circulo;


    @BeforeEach
    void init(){
        circulo = new Circulo(2);
    }

    @Test
    void calcularPerimetro() {
        assertEquals(12.56,circulo.calcularPerimetro());
    }
}