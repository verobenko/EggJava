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
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        
    System.out.print("Ingrese el tamaño del cuadrado: ");
       
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
    
            for (int j = 1; j <= n; j++) {
            
                if (i == 1 || i == n || j == 1 || j == n) {
                
                    // borde
                    System.out.print("* ");
                } else {
                    // espacio 
                    System.out.print("  ");
                }
            }
            // Salto de línea
            System.out.println();
        }
    }
}
