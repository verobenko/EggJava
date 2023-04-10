/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.Guia5;
import java.util.Scanner;
/**
 *
 * @author Veronica
 */
public class ejercicio2BuscarEnVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int x = leer.nextInt();
        int[] vector = new int[x];

        for (int i = 0; i < x; i++) {
            vector[i] = (int) Math.floor(Math.random() * 10);

        }
        System.out.println("Ingrese un numero entre (1/10)");
        int b = leer.nextInt();
        int z = 0;
        for (int i = 0; i < x; i++) {

            if (b == vector[i]) {
                System.out.println("El numero esta en la posicion: " + i);
                z = z + 1;
            } else {
                System.out.println("el numero no se encuentra");
                break;
                
                
            }

        }
        if (z <= 2) {
            System.out.println("el numero se encuentra repetido " + z + " veces");
        }

    }
}  
