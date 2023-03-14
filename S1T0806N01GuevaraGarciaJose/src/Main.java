
import java.util.*;



public class Main {
    public static void main(String[] args) {

        System.out.println("-----------Lista de nombre y cadenas de texto ------------");

        ArrayList<String> nombreCadena = new ArrayList<String>();
        nombreCadena.add("Nidia");
        nombreCadena.add("Vive en Barcelona");
        nombreCadena.add("Soriano");
        nombreCadena.add("Zas");
        nombreCadena.add("Vive en Hospitalet");
        nombreCadena.add("Marcos");
        nombreCadena.add("Se mudo Asturias");
        nombreCadena.add("Vero");
        nombreCadena.add("Esta en Madrid");
        nombreCadena.add("Eli");
        nombreCadena.add("Malaga");
        nombreCadena.add("Alejandra");

        System.out.println("\nLista sin ordenar:  \n" + nombreCadena + "\n");

        Collections.sort(nombreCadena, Comparator.comparingInt(String::length));
        System.out.println("\nLista ordenada " + "por tamaño del texto:  \n" + nombreCadena + "\n");

    }

}