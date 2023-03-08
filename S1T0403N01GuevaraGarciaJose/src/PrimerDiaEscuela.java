import java.util.Arrays;

public class PrimerDiaEscuela {
    public String[] cosasMochila() {
        String[] schoolbag = { "Books", "Notebooks", "Pens" };
        System.out.println("Lo que tengo en mi mochila: "+ Arrays.toString(schoolbag));
        return (schoolbag);
    }

    public void printItems(String []items) {

        System.out.println("El último objeto puesto en mi mochila: " + items[items.length]);

        try {

            for (int i=0; i<=3; i++)

                System.out.println(items[i]);

        }

        catch ( ArrayIndexOutOfBoundsException e ) {

            System.out.println("Ciclo desbordado");

        }

        System.out.println("Ha finalizado la ejecución");

    }
}
