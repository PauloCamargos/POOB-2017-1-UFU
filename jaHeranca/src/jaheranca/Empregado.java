/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaheranca;

/**
 *
 * @author paulo
 */
public class Empregado {
    protected String nome;
    protected String secao;
    protected double salario;

    public Empregado(String nome, String secao, double salario) {
        this.nome = nome;
        this.secao = secao;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }

    public String getSecao() {
        return secao;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void aumentaSalario (double percentual)
    {
        salario *= 1 + percentual/100;
    }

    
}
