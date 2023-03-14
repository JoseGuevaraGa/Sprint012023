import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Lista de Cervezas------------");
        ArrayList<String> cervezas = new ArrayList<>();
        cervezas.add("Coronita");
        cervezas.add("Estrella");
        cervezas.add("Mahou");
        cervezas.add("Skol");
        cervezas.add("Modelo");
        cervezas.add("Budweiser");
        cervezas.add("Cruzcampo");
        cervezas.add("Damm");
        System.out.println(cervezas);

        ArrayList<String> busca = new ArrayList<>();

        busca = containsO(cervezas);

        System.out.println("-----------Lista filtrada contienen la o y más de cinco letras------------");
        System.out.println(busca);

    }

    public static ArrayList containsO(ArrayList cervezas) {
        String cerveza;
        ArrayList<String> encontrado = new ArrayList<>();

        int i = 0;
        while ( i < cervezas.size()){
            cerveza= (String) cervezas.get(i);
            int stringLength = cerveza.length();
            boolean exis=cerveza.contains("o");
            if (exis & stringLength>5){
                encontrado.add(String.valueOf(cervezas.get(i)));
            }
            i++;
        }

        return encontrado;
    }

}