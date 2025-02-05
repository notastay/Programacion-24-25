package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class TestMatriz {

    @BeforeEach
    void generarMatriz(){
        int[][] matriz = generarMatriz();
    }

    @Test
    void comprobarMatriz(){
        assertNotNull(generarMatriz());
    }


    @Test
    void testMatrizCeros(){
        assertEquals(0, numeroLineas(matriz,0));
    }

    @Test
    void testMatrizUnos(){
        assertEquals(8, numeroLineas(matriz,1));
    }

    
}
