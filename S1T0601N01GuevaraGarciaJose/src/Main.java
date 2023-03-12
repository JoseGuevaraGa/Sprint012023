public class Main {
    public static void main(String[] args) {

        NoGenericMethods puerta = new NoGenericMethods();

        puerta.puertaGrueso = 30;
        puerta.puertaAltura = 10;
        puerta.puertaAncho = 20;


        System.out.println("Puerta Alto : " + puerta.getPuertaAltura());
        System.out.println("Puerta Ancho : " + puerta.getPuertaAncho());
        System.out.println("Puerta Grueso : " + puerta.getPuertaGrueso());

        puerta.setPuertaAltura(40);
        System.out.println("Puerta Alto : " + puerta.getPuertaAltura());

    }
}