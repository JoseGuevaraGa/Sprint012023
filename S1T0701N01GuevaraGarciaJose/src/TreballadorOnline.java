public class TreballadorOnline extends Treballador {

    final double TARIFAPLA=35;


    @Deprecated
    public Integer SumaHoras(Integer hora) {
        hora = hora * 3;
        return hora;
    }

    @Override
    public Double CalcularSueldo(Integer horas) {

        double totalSueldo = 0;

        totalSueldo = Treballador.precioHora * horas + TARIFAPLA;

        return totalSueldo;
    }
}
