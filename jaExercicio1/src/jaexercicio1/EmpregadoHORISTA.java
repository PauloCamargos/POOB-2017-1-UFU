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
public class EmpregadoHORISTA extends Empregado{
    
    private double nro_hrs;
    private double qte_hrs;

    public EmpregadoHORISTA(String _pn, String _sn, String _CPF,double nro_hrs, double qte_hrs) {
        super(_pn, _sn, _CPF);
        this.nro_hrs = nro_hrs;
        this.qte_hrs = qte_hrs;
    }

    public double getNro_hrs() {
        return nro_hrs;
    }

    public double getQte_hrs() {
        return qte_hrs;
    }

    public void setNro_hrs(double nro_hrs) {
        this.nro_hrs = nro_hrs;
    }

    public void setQte_hrs(double qte_hrs) {
        this.qte_hrs = qte_hrs;
    }
    
    public void imprimeDados(){
        
        System.out.println("----------- Dados empregado HORISTA ----------");
        System.out.printf("Nome: %s %s\n",this.getPrimeiroNome(),this.getSegundoNome());
        System.out.println("CPF: " + this.getCPF());
        System.out.println("Salario mensal: " + this.nro_hrs*qte_hrs);
        System.out.println("Salario Liquido: " + this.getSalLiquido());
    }
    
    @Override
    public double getSalLiquido(){
        double salario_liquido;
        salario_liquido = 0.85*(this.nro_hrs * this.qte_hrs); //Desconta 15%
        return salario_liquido;
    }
    
}
