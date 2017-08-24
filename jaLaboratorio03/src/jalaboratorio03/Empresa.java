/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalaboratorio03;

/**
 *
 * @author paulo
 */
public class Empresa {
    
    private int qnt = 10;
    public Funcionario[] lista_de_fun = new Funcionario[qnt];
    public double gasto_total = 0;
    public double gasto_se = 0, gasto_eb = 0, gasto_em = 0, gasto_superior = 0;

    public Empresa(Funcionario[] _lista){
        this.lista_de_fun = _lista;
    }
    
    public double retornaGastoTotal(){
        for (Funcionario lista_de_fun1 : lista_de_fun) {
            this.gasto_total += lista_de_fun1.rendaTotal();
        }
        return this.gasto_total;
    }
    
    public void classificaGastos(){
        //double gasto_total_pf;
        for (Funcionario lista_de_fun1 : lista_de_fun) {
            if("class jalaboratorio03.FunEnsinoSuperior".equals(lista_de_fun1.getClass().toString()))           
                this.gasto_superior += lista_de_fun1.rendaTotal();
            else if("class jalaboratorio03.FunEnsinoBasico".equals(lista_de_fun1.getClass().toString()))
                    this.gasto_eb += lista_de_fun1.rendaTotal();
            else if("class jalaboratorio03.FunEnsinoMedio".equals(lista_de_fun1.getClass().toString()))
                    this.gasto_em += lista_de_fun1.rendaTotal();                    
            else if("class jalaboratorio03.FunSemEstudo".equals(lista_de_fun1.getClass().toString()))
                    this.gasto_se += lista_de_fun1.rendaTotal();
            }
        
        System.out.println("-----------------------------------------------");
        System.out.println("------------ RELATÓRIO DE GASTO ---------------");
        System.out.println("-----------------------------------------------\n");
        System.out.println("Gastos totais: " + this.retornaGastoTotal());
        System.out.println("----- Gasto por funcionários ------");
        System.out.println("Funcionário sem estudo: " + this.gasto_se);
        System.out.println("Funcionário ensino básico: " + this.gasto_eb);
        System.out.println("Funcionário ensino médio: " + this.gasto_em);
        System.out.println("Funcionário ensino superior: " + this.gasto_superior);
    }
    
}

    

    

    

