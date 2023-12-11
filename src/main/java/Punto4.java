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
