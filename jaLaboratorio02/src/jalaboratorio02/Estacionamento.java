/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalaboratorio02;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class Estacionamento extends Tempo{
    
    protected String placa;
    protected String marca, modelo;
    Tempo h_entrada = new Tempo();
    Tempo h_saida = new Tempo();

    public Estacionamento(String _placa, String _marca, String _modelo) {
        super();
        this.placa = _placa;
        this.marca = _marca;
        this.modelo = _modelo;
    }
    
    public Estacionamento(){
        super();
        this.placa = "";
        this.marca = "";
        this.modelo = "";
        // this.h_entrada = _hentrada;
        // this.h_saida = _hsaida;
    }
    
    public void solicitaDados(){
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com a placa: ");
        this.placa = input.nextLine();
        System.out.println("Entre com a marca: ");
        this.marca = input.nextLine();
        System.out.println("Entre com o modelo: ");
        this.modelo = input.nextLine();
        System.out.println("Hora de entrada: ");
        h_entrada.solicitaTempo();
        System.out.println("Hora de saída: ");
        h_saida.solicitaTempo();
        System.out.println("=== === === === === === === ===");

    }
    
    public void imprimeDados(){
        
        System.out.println("Dados do veículo: ");
        System.out.println("Placa: " + this.placa);
        System.out.println("Marca :" + this.marca);
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Entrada: ");
        h_entrada.imprimeTempo();
        System.out.println("Saída: ");
        h_saida.imprimeTempo();
        this.valorEstacionamento();
        System.out.println("--------------------------------");
    }
    
    public void valorEstacionamento(){
//        Tempo tempo_estadia;
//        tempo_estadia = h_entrada.subtrai_tempo(h_saida);
        
        super.setHora((h_entrada.subtrai_tempo(h_saida)).getHora());
        
        int valor_total;
        valor_total = super.getHora() * 1;
        
        System.out.println("O tempo total da estadia: ");
        super.imprimeTempo();
        System.out.println("Valor total: " + valor_total + "R$.");        
    }
    
    
}
