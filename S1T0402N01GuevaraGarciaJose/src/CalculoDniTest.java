import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDniTest {


    @Test
    void obtenerLetraDNI() {
        char letra='P';
        assertEquals(letra,CalculoDni.obtenerLetraDNI(26610824));
        letra='T';
        assertEquals(letra,CalculoDni.obtenerLetraDNI(97441386));
        letra='A';
        assertEquals(letra,CalculoDni.obtenerLetraDNI(89622102));
        letra='C';
        assertEquals(letra,CalculoDni.obtenerLetraDNI(65550848));
        letra='Y';
        assertEquals(letra,CalculoDni.obtenerLetraDNI(70497375));
        letra='Q';
        assertEquals(letra,CalculoDni.obtenerLetraDNI(45080729));
        letra='V';
        assertEquals(letra,CalculoDni.obtenerLetraDNI(72296975));
        letra='T';
        assertEquals(letra,CalculoDni.obtenerLetraDNI(56566315));
        letra='P';
        assertEquals(letra,CalculoDni.obtenerLetraDNI(51251483));
        letra='A';
        assertEquals(letra,CalculoDni.obtenerLetraDNI(92905835));
    }
}