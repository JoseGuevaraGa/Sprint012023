import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Escritura {
    List<String> contenido = new ArrayList<>();
    String cadena;

    public void escribeArchivo(String archivo,List escritura){
       /* try (BufferedReader br = new BufferedReader(new FileReader(archivo));
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
        return (contenido);*/
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(archivo));
            ){
            //Escribimos en el fichero
            bw.write(escritura.toString());
            bw.newLine();
            bw.write("Seguimos usando Buffered");
            //Guardamos los cambios del fichero
            bw.flush();
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }

    }
}
