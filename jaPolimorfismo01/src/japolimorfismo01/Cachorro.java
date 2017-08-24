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
public class Cachorro extends Animal{
    
    public int idade;
    
    public Cachorro(String _nome, String _cor, int _peso, int _idade)
    {
        super(_nome, _cor, _peso);
        this.idade = _idade;
    }

    public int getIdade() {
        return idade;
    }
    
    @Override
    public String tipoComida(){
        return("Cachorro come gato;");
    }
    
}
