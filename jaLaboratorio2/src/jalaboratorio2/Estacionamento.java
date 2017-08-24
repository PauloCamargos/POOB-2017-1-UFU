/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalaboratorio2;

import java.util.Scanner;

/**
 *
 * @author Windows 8
 */
public class Estacionamento extends Tempo{
    
    protected String placa_carro;
    protected String marca_carro;
    protected Tempo tempo_i = new Tempo();
    protected Tempo tempo_f = new Tempo();
    
    public Estacionamento(String placa_carro, String marca_carro) { //***************************
        super();
        //super(hora, min, seg); //***************************
        //***************************
        this.placa_carro = placa_carro;
        this.marca_carro = marca_carro;
    }
    
    public Estacionamento() {
        this.placa_carro = "";
        this.marca_carro = "";
    }
    
   Scanner entrada = new Scanner(System.in);
   
    public void le_dados(){
        //***************************
        System.out.println("Digite da placa do carro: ");
        this.placa_carro = entrada.nextLine();
        System.out.println("Digite a marca do carro: ");
        this.marca_carro = entrada.next();
        System.out.println("Digite a hora de entrada hh mm ss: ");
        tempo_i.recebeTempo();
        System.out.println("Digite a hora de saida hh mm ss: ");
        tempo_f.recebeTempo();
    }
    
    public void imprime_dados(){
        System.out.println("Carro: " + marca_carro);
        System.out.println("Placa: " + placa_carro);
        System.out.println("Hora de entrada: ");
        tempo_i.imprime_tempo();
        System.out.println("Hora de saida: ");
        tempo_f.imprime_tempo();
        System.out.println("O valor cobrado será: " + valor_cobrado()+ " R$.");
     }
    
    protected int valor_cobrado(){
        
      Tempo valor;
      valor = tempo_f.tempo_subtraido(tempo_i);
             
      return valor.getHora();
        
    }
}
