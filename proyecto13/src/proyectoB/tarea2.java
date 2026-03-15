package proyectoB;

import proyectoA.tareal;   // importa la clase del otro paquete
import java.util.InputMismatchException;
import java.util.Scanner;

public class tarea2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            tarea1 potencia = new tarea1();   // crea objeto → lee los dos números
            potencia.lectura();               // muestra lo leído (opcional)
            potencia.operacion();             // si tienes lógica extra aquí

            double resultadoPotencia = potencia.potencia();
            System.out.println("Potencia calculada: " + resultadoPotencia);

            // Ahora la parte de dividir por cero
            System.out.print("Ingrese un número para dividir el resultado: ");
            double divisor = sc.nextDouble();

            if (divisor == 0) {
                throw new ArithmeticException("No se puede dividir por cero");
            }

            double division = resultadoPotencia / divisor;
            System.out.println("Resultado de dividir la potencia entre el número: " + division);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar números válidos.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}