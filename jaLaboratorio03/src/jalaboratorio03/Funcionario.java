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
public abstract class Funcionario {
    
    protected String nome;
    protected String codigo;
    //protected int taxa = 1;
    protected int renda_basica = 1000;
    
    public Funcionario(){
   
    }
    
    public Funcionario(String _nome, String _codigo){
        this.nome = _nome;
        this.codigo = _codigo;
        //this.taxa = _taxa;
        //this.renda_basica = _rendab;
    }

    public void setNome(String nome) {        this.nome = nome;    }
    public void setCodigo(String codigo) {        this.codigo = codigo;    }
    //public void setTaxa(int taxa) {        this.taxa = taxa;    }
    public String getNome() {        return nome;    }
    public String getCodigo() {        return codigo;    }
    //public int getTaxa() {        return taxa;    }
    
    public void imprimeDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Código: " + this.codigo);
        System.out.println("Renda Total: " + this.rendaTotal());
    }
    
    abstract double rendaTotal();  
    
}
