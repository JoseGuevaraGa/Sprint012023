public class Cotxe {
    public static final String MARCA="Seat";
    public static String modelo;
    final int POTENCIA=150;

    public static String getModelo() {
        return modelo;
    }
    public int getPotencia() {
        return POTENCIA;
    }

    public static void frenar(){
        System.out.println("El vehicle està frenant" );
    }
    public void acelerar(){
        System.out.println("El vehicle està accelerant");
    }
}
