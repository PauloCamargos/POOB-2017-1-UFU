/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalaboratorio0402;

/**
 *
 * @author paulo
 */
public abstract class Imovel {
    
    protected String endereco;
    protected double preco;

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }
    
    public Imovel(){
        this.endereco = "";
        this.preco = 200000;
    }
    
    abstract void valorTotal();
    
}
