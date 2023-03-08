import static org.junit.jupiter.api.Assertions.*;

class MesTest {

    @org.junit.jupiter.api.Test
    void getMonths() {
        Mes.months.add("Enero");
        Mes.months.add("Febrero");
        Mes.months.add("Marzo");
        Mes.months.add("Abril");
        Mes.months.add("Mayo");
        Mes.months.add("Junio");
        Mes.months.add("Julio");
        Mes.months.add("Agosto");
        Mes.months.add("Septiembre");
        Mes.months.add("Octubre");
        Mes.months.add("Noviembre");
        Mes.months.add("Diciembre");

        assertEquals(12, Mes.months.size());
        assertEquals("Agosto", Mes.months.get(7));
    }



}