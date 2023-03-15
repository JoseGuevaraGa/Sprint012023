import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDniTest {


    @ParameterizedTest
    @CsvSource({"P,26610824", "T,97441386", "A,89622102","C,65550848","Y,70497375","Q,45080729","V,72296975","T,56566315","P,51251483","A,92905835"})
    void letraDni(char let, int dni) {
        assertEquals(let,CalculoDni.obtenerLetraDNI(dni));
    }

}