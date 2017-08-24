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
public class VIP extends Ingresso{
    
    public double valor_adicional;
    
    public VIP(){
        super();
    }
    
    public VIP(double _va){
        super();
        this.valor_adicional = _va;
    }
    
    @Override
    public void imprimeValor(){
        double v_total = super.valor_ingresso + this.valor_adicional;
        System.out.println("Valor ingresso VIP: " + v_total);
    }
    
}
