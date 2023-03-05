import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("************ 11 objectes Month ***************");
        Month.months.add("Enero");
        Month.months.add("Febrero");
        Month.months.add("Marzo");
        Month.months.add("Abril");
        Month.months.add("Mayo");
        Month.months.add("Junio");
        Month.months.add("Julio");
        Month.months.add("Septiembre");
        Month.months.add("Octubre");
        Month.months.add("Noviembre");
        Month.months.add("Diciembre");
        System.out.println(Month.months);
        Month.months.add(7,Month.nameMonth);
        System.out.println(Month.months);

        System.out.println("************ HashSet ***************");
        HashSet<String> hMonths = new HashSet<String>();
        hMonths.add("Enero");
        hMonths.add("Febrero");
        hMonths.add("Marzo");
        hMonths.add("Abril");
        hMonths.add("Mayo");
        hMonths.add("Junio");
        hMonths.add("Julio");
        hMonths.add("Septiembre");
        hMonths.add("Octubre");
        hMonths.add("Noviembre");
        hMonths.add("Diciembre");
        System.out.println(hMonths);
        hMonths.add("Agosto");
        //Duplicados
        hMonths.add("Enero");
        hMonths.add("Febrero");
        System.out.println(hMonths);

        // HashSet
        Iterator<String> it = hMonths.iterator();

        System.out.println("************************************");
        System.out.println("Iterar HashSet usando iterator : ");

        // Iterate HashSet with the help of hasNext() and
        for (int i = 0; i < hMonths.size(); i++) {
            //System.out.println("Indice:" + i);
            System.out.print(it.next() + " ");
        }

        // Creamos una lista de listas listOfLists in Java
        List<List<Integer>> listadeListas = new ArrayList<>();

        // Creamos nuestra lista
        List<Integer> listaEnteros = new ArrayList<>();

        // Añadimos elementos a nuestra lista
        listaEnteros.add(1);
        listaEnteros.add(2);
        listaEnteros.add(3);

        // Añadimos los elemntos a nuestra lista principal
        listadeListas.add(listaEnteros);

        // Creamos nuestra segunda lista
        List<Integer> listaEnteros2 = new ArrayList<>();

        // Añadimos elementos a nuestra segunda lista
        listaEnteros2.add(101);
        listaEnteros2.add(202);
        listaEnteros2.add(303);

        // llista els elements de la primera en ordre invers.
        for (int i = 2; i >= 0; i--) {
            listaEnteros2.add(listaEnteros.get(i));
        }


        System.out.println("\n************************************\n");
        System.out.println("Lista de Enteros dos y una inversa : " + listaEnteros2);

        // crear nuestri objeto ListIterator<String>
        ListIterator<Integer> iterator = listaEnteros.listIterator();

        System.out.println("\nllegir els elements de la primera llista i inserir-los en la segona:\n");

        while (iterator.hasNext()) {
            listaEnteros2.add(iterator.next());
        }
        System.out.println("Lista final : " + listaEnteros2);
    }
}
