public class Main {
    public static void main(String[] args) {
        String mensj;

        Smartphone s1 = new Smartphone();
        s1.marca= "Samsung";
        s1.modelo= "Galaxy";

        System.out.println("------------------------------------");
        mensj=s1.Trucar("670011222");
        System.out.println(mensj);
        System.out.println("Marca: " + s1.getMarca());
        System.out.println("Model: " + s1.getModelo());

        s1.fotografiar();
        s1.alarma();
    }
}