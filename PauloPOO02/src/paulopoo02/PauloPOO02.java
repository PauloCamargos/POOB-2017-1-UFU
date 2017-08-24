/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paulopoo02;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class PauloPOO02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conta itau[] = new Conta[6]; 
        
        Scanner input = new Scanner(System.in);
        System.out.println("Conta Corrente");
        System.out.println("Entre com o saldo: ");        
        for(int i = 0; i < 3; i++){
            itau[i] = new ContaCorrente(input.nextInt());
        }
        
        System.out.println("Conta Poupança");
        System.out.println("Entre com o saldo: ");
        for(int i = 3; i<6;i++){
            itau[i] = new ContaPoupanca(input.nextInt());
        }
    }
    
}
