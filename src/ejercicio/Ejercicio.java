
//Crear un programa que solicite un número y con ese número(multiplicador) realice la
//tabla de multiplicar, debe imprimir el resultado de la multiplicación mostrando el
//multiplicando, el multiplicador y el resultado.

package ejercicio;
import java.util.Scanner;
/**
 *
 * @author maria alejandra
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entra =new Scanner (System.in );
        System.out.println("da nmero");
        int num = entra.nextInt();
        int a=0;
            while(a<=10){
              int resultado = num*a;
              System.out.println(num+ "x" + a +"=" + resultado);
              a++;
            }
              
           }
        
    }
    
