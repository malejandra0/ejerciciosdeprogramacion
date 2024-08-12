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
        System.out.println("los datos a meter son un maximo de 5");
        int[]numero= new int[5];
        int a=0;
        while(a<5){
            System.out.println("da numero");
            numero[a]=entrada.nextInt();
            a++; 
        }
        int b=0;
        int posi=0;
        int nega=0;
        int cero=0;
        while(b<5){
            if(numero[b]<0){
                nega++;
            }else if(numero[b]>0){
                posi++;
            }else{
                cero++;
            }
        b++;
        }
        System.out.println("los numeros positivos son:"+posi);
        System.out.println("los numeros negativos son:"+nega);
        System.out.println("los ceros son:"+cero);
    }   
}
