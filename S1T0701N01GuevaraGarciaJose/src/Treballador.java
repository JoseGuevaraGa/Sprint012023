public class Treballador {
    protected static double precioHora;
    protected static String nombre;
    protected static String apellido;

    public static double getPrecioHora() {
        return precioHora;
    }

    public static void setPrecioHora(double precioHora) {
        Treballador.precioHora = precioHora;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Treballador.nombre = nombre;
    }

    public static String getApellido() {
        return apellido;
    }

    public static void setApellido(String apellido) {
        Treballador.apellido = apellido;
    }

    public Double CalcularSueldo(Integer horas) {

        double totalSueldo = 0;

        totalSueldo = this.precioHora * horas;

        return totalSueldo;
    }
}
