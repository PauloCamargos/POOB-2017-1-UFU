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
public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo) {
        super(saldo);
    }
    
    @Override
    public void Atualiza(double taxa){
        //Taxa em %
        this.saldo *= (1+(taxa/100)*2);
    }
    
    @Override
    public void Deposita(double deposito){
        this.saldo += deposito;
        this.saldo -= 0.1;
    }
}
