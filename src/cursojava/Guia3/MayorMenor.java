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
public class MayorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1 >= 25 && num2 >= 25)  {
            System.out.println("Los dos numeros ingresados son mayor a 25");
            
            
        } else if(num1>= 25 || num2>= 25){
            System.out.println("Al menos uno de los dos numeros ingresados es mayor a 25");
        } else {
            System.out.println("Ninguno de los numeros ingresados es mayor a 25");
        }
            
    } 
    
}
