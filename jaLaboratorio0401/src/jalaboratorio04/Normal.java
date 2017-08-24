/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalaboratorio04;

/**
 *
 * @author paulo
 */
public class Normal extends Ingresso{
    
    public Normal(){
        super();
    }
    
    public void imprimeNormal(){
        System.out.println("Ingresso Normal");
        System.out.println("Valor: " + super.valor_ingresso);
    }
}
