/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacircunferencia;

/**
 *
 * @author paulo
 */
public class JavaCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia c1 = new Circunferencia();
        Circunferencia c2 = new Circunferencia();
        
        System.out.println("O raio de c1: " + c1.getRaio());
        System.out.println("O comprimento de c1: " + c1.calculaComprimento());
        System.out.println("O raio de c2: " + c2.getRaio());
        System.out.println("O comprimento de c2: " + c2.calculaComprimento());
        
        
        c1.setRaio(2);
        c2.setRaio(5);
        
        System.out.println("O raio de c1: " + c1.getRaio());
        System.out.println("O comprimento de c1: " + c1.calculaComprimento());
        System.out.println("O raio de c2: " + c2.getRaio());
        System.out.println("O comprimento de c2: " + c2.calculaComprimento());
    }
    
}
