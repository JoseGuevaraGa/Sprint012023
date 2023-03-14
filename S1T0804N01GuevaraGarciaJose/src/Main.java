import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        System.out.println("-----------Meses del año------------");
        ArrayList<String> mes = new ArrayList<>();
        mes.add("Enero");
        mes.add("Febrero");
        mes.add("Marzo");
        mes.add("Abril");
        mes.add("Mayo");
        mes.add("Junio");
        mes.add("Julio");
        mes.add("Agosto");
        mes.add("Septiembre");
        mes.add("Octubre");
        mes.add("Noviembre");
        mes.add("Diciembre");

        // method reference
        mes.stream().forEach(System.out::println);

    }


}