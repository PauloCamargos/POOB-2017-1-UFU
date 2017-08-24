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
public class CamaroteInferior extends VIP{
    
    public String localizacao ;
   // public double adicional = 5;
    
    public CamaroteInferior(){
        super.valor_adicional = 5;
        this.localizacao = "Camarote Inferior";
    }
    
    public CamaroteInferior(String _local){
        super();
        this.localizacao = _local;
    }
    
    public void setLocalizacao(String _local){
        this.localizacao = _local;
    }
    
    public String getLocalizacao(){
        return this.localizacao;
    }
    
    public void imprimeLocalizacao(){
        System.out.println("Localização: " + this.localizacao);
    }
}
