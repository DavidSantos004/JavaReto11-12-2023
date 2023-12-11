/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */




// Importamos la libreria para poder scannear los datos que le solicitamos al usuario
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Punto1 {

    public static void main(String[] args) {
        // creamos el objeto scanner para usarlo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Un numero");
        //declaramos la variable n que es el numero ingresado por el usuario
        int n = scanner.nextInt();
        //esta es una variable que vamos a usar como contador para el ciclo
        int i = 0;
        int number = 0;
        
        while(i < n){
            //en este condicional decimos que si el contador (ya sea 1,2,3,4 etc) al sacarle el resto por 3 y 5 da igual a 0 si esto se cumple
            //significa que este numero es multiplo de los 2 numero lo cual no queremos que este numero aparezca
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("soy multiplo de los 2");
               
            }
            //en este condicional preguntamos si el contador al sacarle el resto de 3 o 5 es igual a 0 si esto es asi si entra en la suma
            else if (i % 3 == 0 || i % 5 == 0){
            number = number + i;
            System.out.println(i);
            }
        i++;
            }
        System.out.println(number);
    }
}
