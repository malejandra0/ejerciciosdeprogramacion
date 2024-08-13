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
    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);
        System.out.println("Ingrese los 10 números:");
        int[] num = new int[10];
        int[] nume = new int[10];
        int suma = 0;
        int promedio;

        for (int a = 0; a < 10; a++) {
            num[a] = entra.nextInt();
            suma += num[a];
        }

        for (int z = 0; z < 10; z++) {
            int temp = 0;
            for (int y = 0; y < 10; y++) {
                if (num[z] == num[y]) {
                    temp++;
                }
            }
            nume[z] = temp;
        }

        promedio = suma / 10;
        String resultados = "";

        for (int x = 0; x < 10; x++) {
            boolean repetido = false;
            for (int w = 0; w < x; w++) {  // Comparamos con los números anteriores, no todos
                if (num[x] == num[w]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                resultados += "Número " + num[x] + " se repite " + nume[x] + " veces\n";
            }
        }

        System.out.println("Los resultados son:\n" + resultados);
        System.out.println("El promedio de los números es: " + promedio);
    }
}
   


        

