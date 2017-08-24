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
public class Ingresso {
    
    protected double valor_ingresso ;
    
    public Ingresso(){
        this.valor_ingresso = 15;
    }
    
    public Ingresso(double _vi){
        this.valor_ingresso = _vi;
    }
    
    public void imprimeValor(){
        System.out.println("Valor do ingresso:" + this.valor_ingresso);
    }
}
