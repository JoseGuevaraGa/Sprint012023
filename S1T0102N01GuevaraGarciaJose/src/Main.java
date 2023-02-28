public class Main {
    public static void main(String[] args) {

        //Cotxe.MARCA = "Mercedes";  //No deja asignar valor a una variable final
        Cotxe.modelo="Ibiza";
        //Cotxe.POTENCIA = 100;  //no puede ser referenciado desde un contexto estático, final no puede ser sobreescrito

        Cotxe.frenar();  //mètode estàtic

        Cotxe a = new Cotxe();  //mètode no estàtic, Instancio la clase
        a.acelerar();

        System.out.println(a.getPotencia());
        System.out.println(a.getModelo());
        System.out.println("Marca = " + Cotxe.MARCA);

    }
}