public class Texto {


    public static Integer verLongitud(String cadena) {
        int tamaño = 8;
        if(cadena.length() != 8){
           tamaño = cadena.length();
        }

        return tamaño;
    }

}
