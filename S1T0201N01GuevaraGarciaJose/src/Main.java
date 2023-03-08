public class Main {
    public static void main(String[] args) {

        System.out.println("Inicia:");
        // declaro un array de enteros.
        Venda[] lista;

        // asigno memoria para 2 objetos del tipo Student.
        lista = new Venda[2];

        // inicializa el primer elemento del array
        lista[0] = new Venda("Leche",1.20);
        lista[1] = new Venda("Pan",1.30);
        //Llamo al metodo calcular Total
        Venda.calcularTotal(lista);

        //Prueba exeption
        try {
            Venda numFromNegativeIndex = lista[-1]; // Intentando acceder a un indice negativo
            Venda numFromGreaterIndex = lista[6]; // Intentando entrar a un indice mayor
            Venda numFromLengthIndex = lista[5]; // Intentando entrar a un indice del tamaño del array
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException caught");
            e.printStackTrace();
        }
    }
}