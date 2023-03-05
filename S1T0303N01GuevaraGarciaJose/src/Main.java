import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        String textoSeparado1="";
        String textoSeparado2="";

        HashMap<String, String> capitales = new HashMap<String, String>();
        String cadena;
        FileReader f = new FileReader("C:\\Countries.txt");
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            //System.out.println(cadena);
            //String[] cadenas = cadena.split(" "); //\t

            String[] arrSplit_2 = cadena.split(" ");
            for (int i = 0; i < arrSplit_2.length; i++) {
                //System.out.println(arrSplit_2[i]);
                if (i == 0) {
                    textoSeparado1 = arrSplit_2[i];
                } else {
                    textoSeparado2 = arrSplit_2[i];
                }
                capitales.put(textoSeparado1 , textoSeparado2);
            }
        }
        b.close();

        Scanner captura = new Scanner(System.in);

        String nombre;

        System.out.println("Introduce tu nombre: ");
        nombre = captura.next();

        byte numero1, maxIntentos, puntos;
        String capital, capitalCorrecta, mensaje;
        double numero2;

        int i = 0;
        puntos = 0;
        maxIntentos = 10;

        while (i < maxIntentos ){
            Set<String> keySet = capitales.keySet();
            List<String> keyList = new ArrayList<>(keySet);

            int size = keyList.size();
            int randIdx = new Random().nextInt(size);

            String randomKey = keyList.get(randIdx);
            String randomValue = capitales.get(randomKey);

            //System.out.println("key: " + randomKey + ", value: " + randomValue);
            capitalCorrecta =  randomValue;

            System.out.println("Introduce la capital de: " + randomKey);
            capital = captura.next();


            if (capital.equalsIgnoreCase(capitalCorrecta)) {
                System.out.println("Enhorabuena, la capital es: " + capitalCorrecta  );
                puntos += 1;
            }else {
                System.out.println("Capital incorrecta la correcta es " + capitalCorrecta  );
            }

            i++;
        }
        mensaje = ("Nombre: " + nombre + " Puntuación: " + puntos);
      Escritura.escribe(mensaje);
    }

}