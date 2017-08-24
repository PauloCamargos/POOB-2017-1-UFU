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
public class Tempo {
    
    protected int hora, min, seg;
    
    public Tempo(){
//        this.hora = 0;
//        this.min = 0;
//        this.seg = 0;
    } // Fim do contrutor Tempo de aridade 0.

    public Tempo(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    } // Fim do construtor Tempo de aridade 3
    
    //Getters e Setters
    public int getHora(){ 
        return this.hora;
    }
    
    public int getMin(){
        return this.min;
    }
    
    public int getSeg(){
        return this.seg;
    }
    
    public void setHora(int _hora){
        this.hora = _hora;        
    }
    
    public void setMin(int _min){
        this.min = _min;
    }
    
    public void setSeg(int _seg){
        this.seg = _seg;
    }
    
    public void solicitaTempo(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Entre com o tempo no formato hh mm ss: ");
        this.hora = input.nextInt();
        this.min = input.nextInt();
        this.seg = input.nextInt();
    } //Fim do método solicita hora.
    
    public void imprimeTempo(){
        System.out.printf("%d:%d:%d", hora, min,seg);
        System.out.printf("\n");
    } // Fim do método imprimeTempo.
    
    public Tempo adicionaTempo(Tempo _time){
        int t;
        t = _time.converteSegundos() + this.converteSegundos();
        return converteHHMMSS(t); 
    } // Fim do método adidiona tempo
    
    public Tempo subtrai_tempo(Tempo _time){
        int t;
        t = _time.converteSegundos() - this.converteSegundos();
        return converteHHMMSS(t);
    } // Fim do método adidiona tempo
    
    public int converteSegundos(){
        int tempo_segundos;
        tempo_segundos = this.seg + this.min*60 + this.hora*3600;
        return tempo_segundos;
    } //Fim do método converte segundos
    
    public Tempo converteHHMMSS(int tempo_segundos){
        int h,m,s;
        h = tempo_segundos/3600;
        tempo_segundos = tempo_segundos - (3600*h);
        m = tempo_segundos/60;
        tempo_segundos = tempo_segundos - (60*m);
        s = tempo_segundos;
        
        Tempo hhssmm = new Tempo(h,m,s);
        return hhssmm;
    } //Fim do método converteHHMMSS
    
}
