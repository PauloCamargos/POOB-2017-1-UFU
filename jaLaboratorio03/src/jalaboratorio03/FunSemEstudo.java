/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalaboratorio03;

/**
 *
 * @author paulo
 */
public class FunSemEstudo extends Funcionario{

    public FunSemEstudo() {
    }

    public FunSemEstudo(String _nome, String _codigo) {
        super(_nome, _codigo);
    }
    
    @Override
    public double rendaTotal(){
        int taxa = 1;
        return super.renda_basica * taxa;
    }
    
    @Override
    public void imprimeDados(){
        super.imprimeDados();        
    }
    
}
