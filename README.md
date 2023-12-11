# Solucion Ejercicios Reto Java

En este repositorio encontraras las realizacion de los ejercicios puestos por el docente el dia 11/12/2023

## Solucion ejercicio 1

![Captura de Pantalla](./imagenes/Ejercicio%201.png)

```JAVA
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
```

## Solucion ejercicio 2

![Captura de Pantalla](./imagenes/Ejercicio%202.png)
```JAVA
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Importamos la libreria para escannear la entrada para soliciatar datos al usuario
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Punto2 {
    public static void main(String[] args){
        // creamos el objeto escaner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Una contraseña");
        //le solicitamos la contraseañ al usuario
        String contraseña = scanner.nextLine();
        //en este condicional solicitamos que la contraseña ingresada por el usuario tenga mas de 8 caracteres
        if (contraseña.length() > 8){
            System.out.println("TENGO MAS DE 8 CARACTERES");
            //en este condicional solicitamos que la contraseña ingresada por el usuario tenga mas de al menos 1 mayuscula
            if(contraseña.contains("A") || contraseña.contains("B") || contraseña.contains("C") || contraseña.contains("D")
                     || contraseña.contains("F") || contraseña.contains("G") || contraseña.contains("H")
                     || contraseña.contains("I") || contraseña.contains("J") || contraseña.contains("K")
                     || contraseña.contains("L") || contraseña.contains("M") || contraseña.contains("N") 
                     || contraseña.contains("O") || contraseña.contains("P") || contraseña.contains("Q")
                     || contraseña.contains("R") || contraseña.contains("S") || contraseña.contains("T")
                     || contraseña.contains("U") || contraseña.contains("V") || contraseña.contains("W")
                     || contraseña.contains("X") || contraseña.contains("Y") || contraseña.contains("Z")){
                     System.out.println("TENGO 1 MAYUSCULA");
                     //en este condicional solicitamos que la contraseña ingresada por el usuario tenga almenos 1 numero
                     if(contraseña.contains("1") || contraseña.contains("2") || contraseña.contains("3") 
                        || contraseña.contains("4") || contraseña.contains("5") || contraseña.contains("6")
                        || contraseña.contains("7") || contraseña.contains("8") || contraseña.contains("9")){
                        System.out.println("TENGO ALMENOS 1 NUMERO"); 
                        //en este condicional solicitamos que la contraseña ingresada por el usuario tenga almenos 1 caracter especial
                        if(contraseña.contains("!") || contraseña.contains("@") || contraseña.contains("#") 
                        || contraseña.contains("$") || contraseña.contains("%") || contraseña.contains("^")
                        || contraseña.contains("&") || contraseña.contains("*") ){
                        System.out.println("TENGO ALMENOS 1 CARACTER ESPECIAL");
                        System.out.println("SU CONTRASEÑA ES VALIDA");
                    }  
                }
            }
        }
    }
}
```


## solucion ejercicio 3

![Captura de Pantalla](./imagenes/Ejercicio%203.png)

```JAVA
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Random;

public class Punto3 {
     public static void main(String[] args){
         System.out.println("No c como hacerlo :( )");
     }
}

```

## solucion ejercicio 4

![Captura de Pantalla](./imagenes/Ejercicio%204.png)

```JAVA
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Punto4 {
    /*
    * Por lo que entiendo lo que se quiere lograr es mostrar una lista de numeros que empieza desde 0 
      y cada uno de los numeros que se muestran sea doble del anterior  
    */
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        
        for (int i=0; i < 10; i++){
            System.out.println(a);
            a = b;
            b = a+ b;
        }
    }
}
```