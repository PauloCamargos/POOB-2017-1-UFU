/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japolimorfismo01;

/**
 *
 * @author paulo
 */
public abstract class Animal {
    
    
    protected String nome;
    protected String cor;
    protected int peso;
            
    public Animal(String _nome, String _cor, int _peso)
    {
        this.nome = _nome;
        this.cor = _cor;
        this.peso = _peso;
    }

    public String getNome() {        return nome;    }
    public String getCor() {        return cor;    }
    public int getPeso() {        return peso;    }
    public void setNome(String nome) {        this.nome = nome;    }
    public void setCor(String cor) {       this.cor = cor;    }
    public void setPeso(int peso) {        this.peso = peso;    }
  
    public abstract String tipoComida();
    
}
