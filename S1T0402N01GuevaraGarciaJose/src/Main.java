import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dni;
        do{
            System.out.print("Introduce número de DNI: ");
            dni = sc.nextInt();
        }while(dni < 1);
        System.out.println("Letra dni -> " + CalculoDni.obtenerLetraDNI(dni));
    }

}