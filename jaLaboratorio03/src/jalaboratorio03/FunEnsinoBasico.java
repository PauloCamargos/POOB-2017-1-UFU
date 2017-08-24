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
public class FunEnsinoBasico extends FunSemEstudo{
    
    protected String escola_basica;
    
    public FunEnsinoBasico(String _nome, String _codigo,String _escolab){
        super(_nome, _codigo);
        this.escola_basica = _escolab;
    }

    public String getEscola_basica() {        return escola_basica;    }

    public void setEscola_basica(String escola_basica) {        this.escola_basica = escola_basica;    }
    
    @Override
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Escola Básica: " + this.escola_basica);
    }
    
    @Override
    public double rendaTotal(){
        double taxa = 1.1;
        return super.renda_basica * taxa;
    }
    
}
