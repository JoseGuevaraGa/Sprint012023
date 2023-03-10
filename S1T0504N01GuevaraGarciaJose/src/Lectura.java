import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lectura {

    //HashMap<String> paises = new HashMap<String>();
    List<String> contenido = new ArrayList<>();
    String cadena;

    public List<String> leerArchivo(String archivo) throws IOException {
        {

            FileReader f = new FileReader(archivo);
            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {

                //System.out.println(cadena);
                contenido.add(cadena);
            }
            b.close();
            return (contenido);
        }


    }
}
