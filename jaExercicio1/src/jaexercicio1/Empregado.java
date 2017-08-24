/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaexercicio1;

/**
 *
 * @author paulo
 */
public abstract class Empregado {
    protected String primeiroNome;
    protected String segundoNome;
    protected String CPF;
    
    public Empregado(String _pn, String _sn, String _CPF )
    {
        this.primeiroNome = _pn;
        this.segundoNome = _sn;
        this.CPF = _CPF;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
    public abstract double getSalLiquido();
}
