package paulopoo02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulo
 */
public class Conta {
    
    protected double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void Deposita(double deposito){
        saldo += deposito;
    }
    
    public void Saca(double saque){
        saldo -= saque;
    }
    
    public void Atualiza(double taxa){
        //Taxa em %
        this.saldo *= (1 + (taxa/100));
    }    
    
}
