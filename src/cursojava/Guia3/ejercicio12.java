/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.Guia3;

import java.util.Scanner;

/**
 *
 * @author Veronica
 */
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ingrese dos numeros");
        Scanner leer = new Scanner (System.in);
        int num1 = leer.nextInt();
        int num2 = leer.nextInt(); 
        
        multiplo(num1, num2);
        
        
    }
    public static void multiplo(int num1, int num2){
        int resultado = num1 % num2;
        
        if (resultado == 0){
            System.out.println("es multiplo");
            
        } else {
            System.out.println("no es multiplo");
        }
                
    }
}
