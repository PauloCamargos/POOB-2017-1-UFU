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
public class FunEnsinoMedio extends FunEnsinoBasico{

    protected String escolam;

    public FunEnsinoMedio(String _nome, String _codigo, String _escolab, String _escolam) {
        super(_nome, _codigo, _escolab);
        this.escolam = _escolam;
    }
    
    public String getEscolam() {
        return escolam;
    }

    public void setEscolam(String escolam) {
        this.escolam = escolam;
    }
    
    @Override
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Escola Ensino Médio: " + this.escolam);
    }
    
    @Override
    public double rendaTotal(){
        double taxa = 1.5;
        return super.renda_basica * taxa;
    }
    
     
}
