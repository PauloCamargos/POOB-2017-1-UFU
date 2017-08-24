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
public class Gato  extends Animal {
    
    public Gato (String _nome, String _cor, int _peso)
    {
        super(_nome, _cor, _peso);
    }
    
    @Override
    public String tipoComida()
    {
        return("Gato come rato;");
    }
}
