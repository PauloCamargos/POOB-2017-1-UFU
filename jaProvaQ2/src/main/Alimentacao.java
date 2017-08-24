/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author paulo
 */
public class Alimentacao extends Pagtos{
    public String descricao;

    public Alimentacao() {
    }

    public Alimentacao(int cpf, double valor, int cod, String _descricao) {
        super(cpf, valor, cod);
        descricao = _descricao;        
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void inserirDadosAlimentacao(int cpf, double valor, int cod, String _descricao) {
        super.cpf = cpf;
        super.valor = valor;
        super.cod = cod;
        descricao = _descricao;
    }
    
    @Override
    public double faturar(){
        double total = this.valor*1.12;
        return total;
        
    }  
    
}
