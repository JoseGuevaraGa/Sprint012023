package Ejercicio1;

public abstract class Instrumento {
    String nombreInstrumento;

    int precioInstrumento;

    public String getNombreInstrumento() {
        return nombreInstrumento;
    }

    public void setNombreInstrumento(String nombreInstrumento) {
        this.nombreInstrumento = nombreInstrumento;
    }

    public int getPrecioInstrumento() {
        return precioInstrumento;
    }

    public void setPrecioInstrumento(int precioInstrumento) {
        this.precioInstrumento = precioInstrumento;
    }

    public Instrumento(){
    }
    public abstract void tocar();
}
