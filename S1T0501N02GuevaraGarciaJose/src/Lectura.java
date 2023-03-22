import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lectura {
    List<String> contenido = new ArrayList<>();
    String cadena;

    public List<String> leerArchivo(String archivo){
        try (BufferedReader br = new BufferedReader(new FileReader(archivo));
        ) {
            //Leemos el fichero y lo mostramos por pantalla
            String linea = br.readLine();
            while (linea != null) {
                //System.out.println(linea);
                contenido.add(linea);
                linea = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error E/S: " + e);
        }
        return (contenido);
    }
}
