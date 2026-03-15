
/**
 *
 * @author arman
 */
public class practica11 {
   public static void main(String[] args) {
       try {
           int[] numeros = {1, 2, 3};
           System.out.println(numeros[10]); 
       } catch (Exception e) {
           System.out.println("Algo salió mal: " + e.getMessage());
       }
   }
}