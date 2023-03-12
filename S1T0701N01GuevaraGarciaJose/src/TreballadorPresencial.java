import javax.swing.JFrame;
import java.lang.annotation.Target;

public class TreballadorPresencial extends Treballador{

    static double benzina = 40;

    public static double getBenzina() {
        return benzina;
    }

    @Deprecated
    public Integer SumaSueldo(Integer sueldo) {
        sueldo = sueldo * 3;
        return sueldo;
    }

    @Override
    public Double CalcularSueldo(Integer horas) {

        double totalSueldo = 0;

        totalSueldo = Treballador.precioHora * horas + benzina;

        return totalSueldo;
    }
}
