/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.Guia5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Veronica
 */
public class ejercicio1vectorhasta100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector;
        vector = new int[100];
        
        for (int i=0; i<100; i++) {
            vector [i] = leer.nextInt();
        }
        for (int i = 99; i <vector.length; i--) {
            vector [i] = leer.nextInt();
            System.out.println(vector [i]);
        }
    }
    
}
