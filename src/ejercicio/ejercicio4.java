//Realizar un programa que permita ingresar 10 números en un vector, el programa debe
//informar cuantas veces se ingresó un número determinado. Ejemplo el 5 se ingresó 4
//veces. Además, se debe calcular el promedio.
package ejercicio;
import java.util.Scanner;
/**
 *
 * @author maria alejandra
 */
public class ejercicio4 { 
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entra= new Scanner(System.in);
        System.out.println("ingrese los 10 numeros");
        int []num= new int[10];
        int a=0;
        int suma=0;
        int promedio=0;
         while(a<10){
            num[a]=entra.nextInt();
            suma+=num[a];
            a++;        
            }
         promedio=suma/10;
         System.out.println("el promedio es de"+ promedio);
        }
   
}

        

