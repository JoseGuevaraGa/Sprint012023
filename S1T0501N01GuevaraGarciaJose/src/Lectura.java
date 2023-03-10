import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lectura {
    //HashMap<String> paises = new HashMap<String>();
    List<String> paises = new ArrayList<>();
    String cadena;
    public List<String> leerPais() throws IOException {

        FileReader f = new FileReader("C:\\paises.txt");
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {

            //System.out.println(cadena);
            paises.add(cadena);
        }
        b.close();
        return (paises);
    }


}
