package Flyweight.Roupas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoupaFactoryTest {

    Roupa roupa1;
    Roupa roupa2;
    Roupa roupa3;
    Roupa roupa4;

    @BeforeEach
    void init(){
        roupa1 = RoupaFactory.getRoupa("S","Jeans",true,false);
        roupa2 = RoupaFactory.getRoupa("XS","Jeans",false,false);
        roupa3 = RoupaFactory.getRoupa("XS","Camisa",false,false);
        roupa4 = RoupaFactory.getRoupa("M","Camisa",true,false);
    }

    @Test
    void getRoupa() {
        assertTrue(!roupa1.iseNova());
        assertFalse(roupa1.isImportado());
        assertEquals("XS", roupa1.getTamanho());
    }

    @Test
    void getQtd() {
        assertEquals(2,RoupaFactory.getQtd());
    }
}