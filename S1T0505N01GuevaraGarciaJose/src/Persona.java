public class Persona implements java.io.Serializable{
    public String nombre;
    public String direccion;
    public String piso;
    public int DNI;
    public int numero;

    public void chequeCorreo() {
        System.out.println("Mandando cheque a " + nombre
                + " " + direccion);
    }
}
