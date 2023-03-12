public class Main {
    public static void main(String[] args) {


        String texto1="Parametro1";
        String texto2="Parametro2";
        int primitivo = 19;

        //GenericMethods<String,String,Integer> uno = new GenericMethods<String,String,Integer>();
        GenericMethods uno = new GenericMethods();
        Persona p1 = new Persona("Juan");


        System.out.println("-------Imprime argumentos pasados al metodo generico ---------");
        uno.imprime(texto1);
        uno.imprime(p1.getNombre());
        uno.imprime(primitivo);


    }
}