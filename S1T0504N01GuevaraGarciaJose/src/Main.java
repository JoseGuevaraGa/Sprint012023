import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("-----------------");
        Lectura contenido = new Lectura();
        List<String> totalEntrada;

        Scanner captura = new Scanner(System.in);

        String archivo;

        System.out.println("Introduce el archivo a leer: ");
        archivo = captura.next();

        totalEntrada= contenido.leerArchivo(archivo);

        System.out.println("-----------Lista Entrada-------------");
        System.out.println(totalEntrada);
        Collections.sort(totalEntrada);
        System.out.println("-----------Lista ordenada------------");
        System.out.println(totalEntrada);
    }
}