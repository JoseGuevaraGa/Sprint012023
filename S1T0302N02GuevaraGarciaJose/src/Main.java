import java.util.*;


public class Main {
    public static void main(String[] args) {

        System.out.println("Lista sin ordenar: ");
// Definir 7 instancias de la Clase Restaurant
        Restaurant mediterraneo = new Restaurant("Casa Pepe", 6);
        Restaurant italiano = new Restaurant("La vella Italia", 7);
        Restaurant mexicano = new Restaurant("Que Taco", 7);
        Restaurant rapida = new Restaurant("Burguer King", 9);
        Restaurant rapida1 = new Restaurant("Burguer King", 8);
        Restaurant italiano1 = new Restaurant("Roma", 9);
        Restaurant rapida2 = new Restaurant("Burguer King", 8);

        // Definir un HashSet
        HashSet restaurants = new HashSet();

        restaurants.add(mediterraneo);
        restaurants.add(italiano);
        restaurants.add(mexicano);
        restaurants.add(rapida);
        restaurants.add(rapida1);
        restaurants.add(italiano1);
        restaurants.add(rapida2);



// Imprimir contenido de HashSet
// Aunque son insertados 7 elementos, el HashSet solo contiene 6 se eliminan los duplicados

        System.out.println(" Total Restaurants: " + restaurants.size());

// Definir Iterator para extraer e imprimir valores


        List<Restaurant> lista =new ArrayList<>();

        for(Iterator it = restaurants.iterator(); it.hasNext(); ) {
            Object objeto = it.next();
            Restaurant restaurant = (Restaurant) objeto;
            System.out.println(restaurant);

            lista.add(restaurant);
        }
        Collections.sort(lista);
        System.out.println("Lista ordenada: " );
        for (Restaurant p :lista) {
            System.out.println(p.toString());

        }
    }

}