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
public class Gerente extends Empregado{
    
    private String secretaria;

    public Gerente(String nome, String secao, double salario, String secretaria) {
        super(nome, secao, salario); //Aqui a super classe é chamada e inicializada.
        this.secretaria = secretaria;
    }

    public void setSecretaria(String secretaria) {
        this.secretaria = secretaria;
    }

    public String getSecretaria() {
        return secretaria;
    }
    
    @Override
    public void aumentaSalario(double percentual) {
        super.aumentaSalario(percentual+15); //To change body of generated methods, choose Tools | Templates.
    }
    
}   