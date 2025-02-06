package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class TestLoto {
    
    @Test
    void noNulo(){
        assertNotNull(generarCombinacion());
    }
    
    @Test
    void combinacion6(){
        int[][] numsLoto=generarCombinacion();
        assertEquals(numsLoto.length, 6);
    }

    @Test
    void comprobarNums(){
        int[][] numsLoto=generarCombinacion();
        for (int i = 0; i < numsLoto.length; i++) {
            assertTrue(numsLoto[i] >= 1 && numsLoto < 50);
        }
    }

    



}
