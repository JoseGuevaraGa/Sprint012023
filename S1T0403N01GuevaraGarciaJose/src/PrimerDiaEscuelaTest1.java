import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimerDiaEscuelaTest1 {

    @Test
    void printItems() {
    }

    PrimerDiaEscuela school = new PrimerDiaEscuela();
    String[] bag = { "Books", "Notebooks", "Pens" };

    @Test
    public void cosasMochila() {
        System.out.println("Prueba cosas mochila ()");
        assertArrayEquals(bag, school.cosasMochila());
    }

    //@Test(expected = ArrayIndexOutOfBoundsException.class)
    @Test
    public void testPrintItems() {

        System.out.println("Prueba imprime cosas mochila " + bag.length);

        school.printItems(bag);


    }
}