import java.io.File;
import java.util.Arrays;

public class Carpeta {

    public static void mostrarCarpeta(File fichero) {
        if (fichero.isDirectory()) {
            File[] lista = fichero.listFiles();
            for (int i = 0; i < lista.length; i++) {
                System.out.println(lista[i].getName());

                if (lista[i].isDirectory()) {
                    mostrarCarpeta(lista[i]);
                }
            }
            //Escritura.escribe(String.valueOf(lista));
            System.out.println("Escribe en archivo Carpetas.txt");
            Escritura.escribe(Arrays.toString(lista));
        } else {
            System.out.println("Archivo2 : " + fichero);
        }

    }
}
