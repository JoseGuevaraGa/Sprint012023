import Ejercicio1.Cuerda;
import Ejercicio1.Instrumento;
import Ejercicio1.Percusion;
import Ejercicio1.Viento;

public class Instrumentos{
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------");
        Instrumento p1 = new Percusion();
        p1.setNombreInstrumento("Tambor");
        p1.setPrecioInstrumento(30);
        p1.tocar();
        System.out.println("Intrumento:" + p1.getNombreInstrumento() + " Precio:" + p1.getPrecioInstrumento());
        System.out.println("-------------------------------------------------------------------");

        Instrumento c1 = new Cuerda();
        c1.setNombreInstrumento("Guitarra");
        c1.setPrecioInstrumento(20);
        c1.tocar();
        System.out.println("Intrumento:" + c1.getNombreInstrumento() + " Precio:" + c1.getPrecioInstrumento());
        System.out.println("-------------------------------------------------------------------");

        Instrumento v1 = new Viento();
        v1.setNombreInstrumento("Flauta");
        v1.setPrecioInstrumento(10);
        v1.tocar();
        System.out.println("Intrumento:" + v1.getNombreInstrumento() + " Precio:" + v1.getPrecioInstrumento());
        System.out.println("-------------------------------------------------------------------");

    }
}