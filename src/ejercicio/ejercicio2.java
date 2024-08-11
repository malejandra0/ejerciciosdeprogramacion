//Programa Java que guarda en un array X (tamaña que desee) números enteros que se
//leen por teclado. A continuación, se recorre el array y calcula cuántos números son
//positivos, cuántos negativos y cuántos ceros, Realizar fase de Análisis de acuerdo a la
//Solución dada.
//Indique otra forma de dar solución al ejercicio.
package ejercicio;
import java.util.Scanner;
/**
 *
 * @author maria alejandra
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        System.out.println("dat a mete");
        int num= entrada.nextInt();
        int[]numero= new int[5];
        int a=0;
        while(a<5){
            System.out.println("da numeros");
            num[a]=Scanner.nextInt();
            a++;
        }
        
        
    }
    
}
