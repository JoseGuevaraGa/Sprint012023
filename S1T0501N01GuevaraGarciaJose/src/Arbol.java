import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;

public class Arbol {
    private String ruta;
    private DefaultMutableTreeNode raiz;

    public Arbol() {
        raiz = null;
        ruta = "";
    }

    public void setRaiz(String ruta) {
        File directorio = new File(ruta);
        this.raiz = new DefaultMutableTreeNode(directorio);
    }

    public String getRuta() {
        return ruta;
    }

    public DefaultMutableTreeNode getRaiz() {
        return raiz;
    }

    public void completar(String ruta, DefaultMutableTreeNode padre ) {
        File directorio = new File(ruta);
        File[] listado = directorio.listFiles();
        DefaultMutableTreeNode aux;
        if(listado != null) {
            for(int i = 0; i < listado.length;i++) {
                aux = new DefaultMutableTreeNode(listado[i].getName());
                padre.add(aux);
                if(listado[i].listFiles() != null) {
                    System.out.println("Ruta: " + ruta+"/"+listado[i].getName());
                    completar(ruta+"/"+listado[i].getName(),aux);
                }
            }
        }
    }
    public void crearArbol(String ruta) {
        completar(ruta, getRaiz());
    }

}
