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
public class EmpregadoCLT extends Empregado{
    
    private double salario_mensal;
    
    public EmpregadoCLT(String _pn, String _sn, String _CPF, double _sm)
    {
        super(_pn, _sn, _CPF);
        this.salario_mensal = _sm;
    }

    public double getSalario_mensal() {
        return salario_mensal;
    }

    public void setSalario_mensal(double salario_mensal) {
        this.salario_mensal = salario_mensal;
    }

    @Override
    public double getSalLiquido(){
        double salario_liquido;
        if(this.salario_mensal>=4000)
            salario_liquido = salario_mensal * 0.725; //desconta 27.5%
        else
            salario_liquido = salario_mensal * 0.85; //desconta 15%
        
        return salario_liquido;
    }
    
    public void imprimeDados(){
        
        System.out.println("----------- Dados empregado CLT ----------");
        System.out.printf("Nome: %s %s\n",this.getPrimeiroNome(),this.getSegundoNome());
        System.out.println("CPF: " + this.getCPF());
        System.out.println("Salario mensal: " + this.getSalario_mensal());
        System.out.println("Salario Liquido: " + this.getSalLiquido());
    }
}
