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
public class ejercicio3DigitosDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int N = leer.nextInt();
        int[] vector = new int[N];

        for (int i = 0; i < N; i++) {
            vector[i] = (int) Math.floor(Math.random() *(10000 - 0 + 1)) + 0;
            System.out.println("" + vector [i]);
        }

    }
}
