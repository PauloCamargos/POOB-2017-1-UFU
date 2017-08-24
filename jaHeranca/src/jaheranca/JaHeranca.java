/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaheranca;

/**
 *
 * @author paulo
 */
public class JaHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        System.out.println("Teste da Heranca: ");
        
        Empregado e1 = new Empregado("Joao", "Contabilidade", 1000.00);
        
        Gerente g1 = new Gerente("Jose", "Amoxarifado", 1000.00, "Maria");
        
        System.out.println(g1.getSecretaria());
        System.out.println(g1.getNome());
        System.out.println(g1.getSalario());
        System.out.println(e1.getSalario());
        e1.aumentaSalario(30.0);
        g1.aumentaSalario(30.0);
        System.out.println(e1.getSalario());
        System.out.println(g1.getSalario()); 
        
                
    }
    
}
