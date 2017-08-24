package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author paulo
 */
public class Resistores {
    
    public double resistencia;
    public double potencia;

    public Resistores(double resistencia, double potencia) {
        this.resistencia = resistencia;
        this.potencia = potencia;
    }
    
    public Resistores() {
        this.resistencia = 0;
        this.potencia = 0;
    }
    
    public Resistores Serie(Resistores R1){
        double r_equivalente = R1.resistencia + this.resistencia; 
        double p_equivalente = R1.potencia;
        if(this.potencia<p_equivalente)
            p_equivalente = this.potencia;
        Resistores Req = new Resistores(r_equivalente, p_equivalente);
        return Req;
    }
    
    public Resistores Paralelo(Resistores R1){
        double r_equivalente = (R1.resistencia*this.resistencia)/
                (R1.resistencia + this.resistencia); 
        double p_equivalente = R1.potencia;
        if(this.potencia<p_equivalente)
            p_equivalente = this.potencia;
        Resistores Req = new Resistores(r_equivalente, p_equivalente);
        return Req;
    }
    
    public void Imprime(){
        System.out.println("Caracteristicas: ");
        System.out.println("Resistência: " + this.resistencia);
        System.out.println("Potência máxima: " + this.potencia);
    }
    
}
