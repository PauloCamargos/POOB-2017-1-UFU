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
public class Tempo {
    
    protected int hora;
    protected int min;
    protected int seg;
      //***************************
      //***************************
        
    public Tempo() {
        hora = 0;
        min = 0;
        seg = 0;
    }

    public Tempo(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }
    
    
  //recebe informação do teclado
    
    public void recebeTempo(){
         Scanner input = new Scanner(System.in);
         this.hora = input.nextInt();
         this.min = input.nextInt();
         this.seg = input.nextInt();
    }

    public int getHora() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    // **************
    
    public void imprime_tempo(){
     
        System.out.println(this.hora + ":" + this.min + ":" + this.seg);
    }
    
    public int converte_segundos(){
        int segundos;
        segundos = this.hora * 3600 + this.min * 60 + this.seg;
        return segundos;
    }
    
    public Tempo converte_hora(int tempo_segundos){
        Tempo t = new Tempo();
        int _hora, _min, _seg;
        
        _hora = tempo_segundos/3600;
        _min = (tempo_segundos - (tempo_segundos/3600))/60;
        _seg = (tempo_segundos - ((tempo_segundos - (tempo_segundos/3600))/60));
        
        t.hora = _hora;
        t.min = _min;
        t.seg = _seg;
        
        return(t);
    }
    
    
    public Tempo tempo_adicionado(Tempo _final){
        
        int t1, t2;
        
        t1 = this.converte_segundos();
        t2 = _final.converte_segundos();
        
        t2 = t2 + t1;
        
         return converte_hora(t2); //***************
        
        
    }
    
    public Tempo tempo_subtraido(Tempo _final){
        
        int intervalo, t1, t2;
        
        t1 = this.converte_segundos();
        t2 = _final.converte_segundos();
        
        intervalo = t1 - t2;
        //t2 = t1 + intervalo;
        
        return converte_hora(intervalo);
    }
}
