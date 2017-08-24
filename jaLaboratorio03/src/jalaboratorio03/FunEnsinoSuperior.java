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
public class FunEnsinoSuperior extends FunEnsinoMedio {
    protected String universidade;

    public FunEnsinoSuperior(String _nome, String _codigo, String _escolab, String _escolam, String universidade) {
        super(_nome, _codigo, _escolab, _escolam);
        this.universidade = universidade;
    }

    

    public String getUniversidade() { return universidade; }

    public void setUniversidade(String universidade) { this.universidade = universidade; }
    
    @Override
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Universidade: " + this.universidade);
    }
    
    @Override
    public double rendaTotal(){
        double taxa = 2;
        return super.renda_basica * taxa;
    }
        
}
