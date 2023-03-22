import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------");
        Lectura contenido = new Lectura();
        Escritura salida = new Escritura();
        List<String> totalEntrada;

        Scanner captura = new Scanner(System.in);

        String archivo="", salidaF="";

        //System.out.println("Introduce el archivo a leer: ");
        //archivo = captura.next();

        Properties properties = new Properties();

        try {
            properties.load(new BufferedReader(new FileReader("C:\\Users\\ppgue\\Videos\\Captures\\V02\\Properties.txt")));
            archivo = properties.getProperty("archivo");
            properties.load(new BufferedReader(new FileReader("C:\\Users\\ppgue\\Videos\\Captures\\V02\\Properties1.txt")));
            salidaF = properties.getProperty("salida");


        } catch (Exception ex) {

        }
        System.out.println("archivo: " + archivo);
        System.out.println("salida: " + salidaF);

        totalEntrada= contenido.leerArchivo(archivo);

        System.out.println("-----------Lista Entrada-------------");
        System.out.println(totalEntrada);
        Collections.sort(totalEntrada);

        //System.out.println("-----------Lista ordenada------------");
        //salidaF="C:\\Users\\ppgue\\Videos\\Captures\\V02\\Asalida.txt";
        salida.escribeArchivo(salidaF,totalEntrada);
    }
}