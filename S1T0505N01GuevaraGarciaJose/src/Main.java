import java.io.IOException;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        Persona e = new Persona();
        e.nombre = "Nadia Lopez";
        e.direccion = "C Argentina, Barcelona";
        e.piso = "1, 2";
        e.DNI = 11122233;
        e.numero = 333;

        try
        {
            FileOutputStream archivo = new
                    FileOutputStream("persona.ser");
            ObjectOutputStream salida = new
                    ObjectOutputStream(archivo);
            salida.writeObject(e);
            salida.close();
            archivo.close();
            System.out.println("Datos guardados en persona.ser");
        }
        catch (IOException i)
        {
            i.printStackTrace();
        }


        Persona uno = null;
        try
        {
            FileInputStream archivo = new
                    FileInputStream("persona.ser");
            ObjectInputStream entrada = new
                    ObjectInputStream(archivo);
            uno = (Persona) entrada.readObject();
            entrada.close();
            archivo.close();
        }
        catch(IOException i)
        {
            i.printStackTrace();
            return;
        }
        catch(ClassNotFoundException c)
        {
            System.out.println("Clase Persona no encontrada");
            c.printStackTrace();
            return;
        }

        System.out.println("----------------------------------------------");
        System.out.println("Deserializando los datos persona...");
        System.out.println("Nombre: " + uno.nombre);
        System.out.println("Direccion: " + uno.direccion);
        System.out.println("Piso: " + uno.piso);
        System.out.println("DNI: " + uno.DNI);
        System.out.println("Numero: " + uno.numero);
    }

}