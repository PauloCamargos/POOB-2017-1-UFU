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
public class CamaroteSuperior extends VIP {
        public String localizacao ;
    
    public CamaroteSuperior(){
        super.valor_adicional = 10;
        this.localizacao = "Camarote Superior";
    }
    
    public CamaroteSuperior(String _local){
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
