package proyectoA;

import java.util.Scanner;

public class tarea1 {  

    private final double n1;
    private final double n2;

    public tarea1() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Su primer número: ");
        n1 = leer.nextDouble();
        System.out.print("Su segundo número: ");
        n2 = leer.nextDouble();
    }

    public double potencia() {
        return Math.pow(n1, n2);
    }

    public void lectura() {
        System.out.println("n1 = " + n1 + ", n2 = " + n2);
    }

    public void operacion() {
        // aquí solo se calcula, no imprime
    }

    public void imprimir() {
        System.out.println("El resultado es: " + potencia());
    }
}
