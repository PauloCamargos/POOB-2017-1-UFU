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
public class Velho extends Imovel{
    
    public double desconto;
    
    public Velho(){
        super.endereco = "Rua Vigário";
        this.desconto = 50000;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public void imprimeDesconto(){
        System.out.println("Valor desconto: " + this.getDesconto    ());
    }
    
    @Override
    public void valorTotal(){
        this.preco -= this.desconto;
        System.out.println("Valor total: " + super.preco);
    }
    
}
