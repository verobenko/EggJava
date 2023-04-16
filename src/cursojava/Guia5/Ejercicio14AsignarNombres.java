/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.Guia5;
import java.util.*;

/**
 *
 * @author Veronica
 */
public class Ejercicio14AsignarNombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] Equipo = new String[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("ingrese el nombre del integrante numero " + i );
            Equipo[i] = leer.nextLine();   
        
        }
        System.out.println("Los integrantes del equipo son:");
       
        for (int i = 0; i < 4; i++) {
            System.out.print("[" + Equipo[i] + "]" );
            
            
        }
        System.out.println(" ");
    }
    
}
