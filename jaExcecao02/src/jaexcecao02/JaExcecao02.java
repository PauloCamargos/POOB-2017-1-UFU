    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jaexcecao02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author paulo
 */

public class JaExcecao02 {
    
    public static int quociente(int numerador, int denominador){
        return (numerador/denominador);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner ( System.in );
        boolean continueLoop = true;
        
        do
        {
            try // TRATAMENTO DE EXCEÇÃO
            {
                System.out.printf("Entre o numerador: ");
                int numerador = scanner.nextInt();
                System.out.printf("Entre o denominador: ");
                int denominador = scanner.nextInt();
                
                int resultado = quociente(numerador, denominador);
                System.out.printf(
                        "\nResultado: %d / %d = %d\n", numerador, denominador,
                        resultado);
                continueLoop = false;               
            } // Fim do try
            
            // caso nao funcione, pegue o tratamento das ecdcoes abaixo
            
            catch (InputMismatchException inputMismatchException)
            {
                System.err.printf("\nEception: %s\n", inputMismatchException);
                scanner.nextLine();
                System.out.println("Tem que ser inteiros. Tente de novo.\n");
            } // FIM DO CATCH
            catch (ArithmeticException arithmeticException)
            {
                System.err.printf("\nException: %s\n", arithmeticException);
                System.out.println("Não existe divisão por zero. Tente de novo\n");
                } // Fim do catch
        }
        while (continueLoop);
    } // Fim do main
} 
