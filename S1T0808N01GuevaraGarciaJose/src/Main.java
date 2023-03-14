public class Main {
    public static void main(String[] args) {



        String cadenaTexto="A1B2X3Z4G6K8", cadenaRevers="";
        System.out.println("Texto original: " + cadenaTexto);

        System.out.println("---------------------------------");
        cadenaRevers = String.valueOf(Reversa.reverse(cadenaTexto));

        System.out.println("Texto al revés: " + cadenaRevers);

    }
}