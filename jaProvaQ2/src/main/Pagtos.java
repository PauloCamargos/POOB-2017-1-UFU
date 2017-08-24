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
public class Pagtos {
    public int cpf;
    public double valor;
    public int cod;

    public Pagtos() {
        this.cpf = 0;
        this.valor = 0;
        this.cod = 0;
    }
    
    public Pagtos(int cpf, double valor, int cod) {
        this.cpf = cpf;
        this.valor = valor;
        this.cod = cod;
    }
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public double faturar(){
        double total  = valor ;
        return total;
    }
    
    public void inserirDados(int _cpf, double _valor, int _cod){
        this.cpf = _cpf;
        this.valor = _valor;
        this.cod = _cod;
    }
}
