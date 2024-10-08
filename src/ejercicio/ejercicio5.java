//En un vector multidimensional de 5 filas(alumnos)y 4 columnas(notas) se guardan las
//notas de 5 alumnos de programación con su respectivo promedio. En las tres primeras
//posiciones van las notas y en la última posición va el promedio de cada uno. Finalizado
//los cálculos se debe mostrar las notas por fila y el promedio correspondiente.
package ejercicio;
import java.util.Scanner; 
/**
 *
 * @author maria alejandra
 */
public class ejercicio5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAlumnos = 5;
        int numNotas = 3;
        double[][] notas = new double[numAlumnos][numNotas];
        double[] promedios = new double[numAlumnos];
        
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("ingrese las 3 notas del aluno " + (i + 1) + ":");
            double suma = 0;
            for (int j = 0; j < numNotas; j++) {
                notas[i][j] = scanner.nextDouble();
                suma += notas[i][j];
            }
            promedios[i] = suma / numNotas; 
        }
        System.out.println("nota y promedios de los alumnos:");
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("alumno " + (i + 1) + ": ");
            for (int j = 0; j < numNotas; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println("| promedio: " + promedios[i]);
        }
    }
}

