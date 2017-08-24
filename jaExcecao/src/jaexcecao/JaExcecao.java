/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaexcecao;
import java.util.Scanner;
/**
 *
 * @author paulo
 */

public class JaExcecao {

    public static int quociente(int numerador, int denominador){
        return (numerador/denominador);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre o numerador: ");
        int numerador = scanner.nextInt();
        System.out.println("Entre com o denominador");
        int denominador = scanner.nextInt();
        
        int resultado = quociente(numerador, denominador);
        System.out.printf("\nResultado: %d / %d = %d\n", numerador, 
                denominador, resultado);
    }
    
}
