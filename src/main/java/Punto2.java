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

