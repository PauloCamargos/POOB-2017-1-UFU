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
public class Novo extends Imovel {
    public double adicional;

        
    public Novo() {
        super.endereco = "Rua das Petunias.";
        this.adicional = 130000;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdiconal(double adiconal) {
        this.adicional = adiconal;
    }

    public void imprimeAdicional(){
        System.out.println("Valor adicional: " + this.getAdicional());
    }
        
    @Override
    public void valorTotal(){
        this.preco += this.adicional;
        System.out.println("Valor total: " + super.preco);
    }
}
