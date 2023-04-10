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
public class OpcionesDistintas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 4");
        int num = leer.nextInt();
        switch (num) {
            case 1:
                System.out.println(" la bomba es una bomba de agua ");
                break;

            case 2:
                System.out.println("la bomba es una bomba de gasolina");
                break;

            case 3:
                System.out.println("la bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("la bomba es una bomba de pasta alimenticia ");
                break;
            default:
                System.out.println("no existe un valor valido para esta bomba");
        }
    }

}

