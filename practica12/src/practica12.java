import java.util.InputMismatchException;
import java.util.Scanner;


public class practica12 {

    /**
     * @author arman
     * @param args
     */
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite un número: ");

        try {
            int numero = entrada.nextInt();
            System.out.println(numero);
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número entero válido.");
        } finally {
            entrada.close(); 
        }
    }
}

