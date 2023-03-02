public class VendaBuidaException extends Exception{

    private String mensajeError;

    public VendaBuidaException(String mensajeError){
        super();
        this.mensajeError=mensajeError;
    }

    @Override
    public String getMessage(){

        String mensaje="";

        mensaje = mensajeError;

        return mensaje;

    }
}
