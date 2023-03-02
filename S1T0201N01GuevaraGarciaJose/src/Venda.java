import java.util.ArrayList;

public class Venda extends Producte {

    static double preuTotalVenda = 0;


    //Colección de productos
    Venda(String nomProducte, double preuProducte)
    {
        this.nomProducte = nomProducte;
        this.preuProducte = preuProducte;
    }


    //Metodo calcular total
    public static void calcularTotal(Venda[] lista)
    {
        try {

            if (lista[0] == null) {
                throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
            } else {

                for (int i = 0; i < lista.length; i++)
                    preuTotalVenda = preuTotalVenda + lista[i].preuProducte;
            }

        } catch (VendaBuidaException ex) {

            System.out.println(ex.getMessage());
        }


        System.out.println("***********************************");
        System.out.println("Preu Total Venda: " + preuTotalVenda);
        System.out.println("***********************************");

    }

}
