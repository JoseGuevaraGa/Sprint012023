import java.io.FileWriter;

public class Escritura {


    public static void escribe(String archivo){
        String[] lineas = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "..." };

        /** FORMA 1 DE ESCRITURA **/
        FileWriter fichero = null;
        try {

            fichero = new FileWriter("C:\\Users\\ppgue\\OneDrive\\Documentos\\Carpetas.txt");


            fichero.write(archivo + "\n");

            fichero.close();

        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }
}
