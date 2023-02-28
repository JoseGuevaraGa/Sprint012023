public class Telefon {
    String marca;
    String modelo;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    static String Trucar(String numTelefon){

        String mensj=("s’està trucant al número:" + numTelefon);

        return mensj;
    }

}
