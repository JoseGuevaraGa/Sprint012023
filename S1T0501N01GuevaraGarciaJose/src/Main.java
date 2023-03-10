import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Lectura paises = new Lectura();
        List<String> totalPais;

        totalPais= paises.leerPais();

        System.out.println("-----------Lista Entrada-------------");
        System.out.println(totalPais);
        Collections.sort(totalPais);
        System.out.println("-----------Lista ordenada------------");
        System.out.println(totalPais);

        //Arbol ruta = new Arbol();
        //ruta.setRaiz("C:\\Users\\ppgue\\OneDrive");
        //ruta.crearArbol("C:\\Users\\ppgue\\OneDrive");
        //JOptionPane.showMessageDialog(null, "Hello World" ); C:\Users\ppgue\OneDrive\Documentos

        System.out.println("-----------Lista Arbol de directorios ------------");
        File fichero = new File("C:\\Users\\ppgue\\Videos\\Captures\\V02");

        Carpeta.mostrarCarpeta(fichero);



        
    }

}