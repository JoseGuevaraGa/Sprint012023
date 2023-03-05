import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {

    public static void escribe(String archivo){
        String[] lineas = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "..." };

        /** FORMA 1 DE ESCRITURA **/
        FileWriter fichero = null;
        try {

            fichero = new FileWriter("C:\\Users\\ppgue\\OneDrive\\Documentos\\puntuacion.txt");


                fichero.write(archivo + "\n");

            fichero.close();

        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }

}
