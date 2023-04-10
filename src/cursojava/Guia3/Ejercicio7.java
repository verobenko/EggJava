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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        int lecturasCorrectas = 0;
        
        int lecturasIncorrectas = 0;
        
        String cadena;
        
        do {
        
            System.out.print("Ingrese una cadena (&&&&& para finalizar): ");
            
            cadena = scan.nextLine();
            
            if (cadena.equals("&&&&&")) {
                break;
            }
            
            if (cadena.length() <= 5 && cadena.substring(0, 1).equals("X") && cadena.substring(cadena.length() - 1).equals("O")) {
                lecturasCorrectas++;
            } else {
                lecturasIncorrectas++;
            }
        
        } while (true);
        
        System.out.println("Informe:");
        
        System.out.println("Lecturas correctas: " + lecturasCorrectas);
        
        System.out.println("Lecturas incorrectas: " + lecturasIncorrectas);
    }
}// TODO code application logic here
