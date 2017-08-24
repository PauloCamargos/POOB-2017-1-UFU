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
public class Saude extends Pagtos{
    
    public String estabelecimento;

    public Saude() {
    }

    public Saude( int cpf, double valor, int cod,String estabelecimento) {
        super(cpf, valor, cod);
        this.estabelecimento = estabelecimento;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }
 
    public void inserirDadosSaude( int _cpf, double _valor, int _cod, String estabelecimento) {
        super.cpf = _cpf;
        super.valor = _valor;
        super.cod = _cod;
        this.estabelecimento = estabelecimento;
    }
    
    @Override
    public double faturar(){
        double total = valor * 1.05;
        return total;
    }
       
}
