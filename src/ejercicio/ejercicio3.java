//La Registraduría Nacional del Estado Civil desea que le construya un programa que
//permita solicitar el año de nacimiento de cada persona y determine si esta persona es
//apta para votar o no. Sugerencia: Cuando ya no desee ingresar más datos se debe digitar
//un valor centinela (buscar un valor apropiado
package ejercicio;
import java.util.Scanner;
/**
 *
 * @author maria alejandra
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entra= new Scanner(System.in);
        int ahora= 2024;
        String ans;
        boolean centinela=true;
        
        do{
        System.out.println("escriba año nacido");
        int año= entra.nextInt();
        int años= ahora-año;
        if(años>=18){
            System.out.println("puede votar");
            }else {
                System.out.println("no puede votar");
        }
            System.out.println("quiere cerrar la aplicacion?");
            ans = entra.next();
            switch (ans){
                case "si" -> centinela=false;
                    
            }
        }while(true==centinela); 
    
    }
}