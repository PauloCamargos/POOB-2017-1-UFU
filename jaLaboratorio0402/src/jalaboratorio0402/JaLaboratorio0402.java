/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalaboratorio0402;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class JaLaboratorio0402 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int resposta;
        
        System.out.print("Digite (1) para Imóvel Novo e (2) para Usado: ");
        resposta = input.nextInt();
        if(resposta == 1){
            Novo novo = new Novo();
            novo.imprimeAdicional();
            novo.valorTotal();
            
        }
        else{
            Velho usado = new Velho();
            usado.imprimeDesconto();
            usado.valorTotal();            
        }
        
    }
    
}
