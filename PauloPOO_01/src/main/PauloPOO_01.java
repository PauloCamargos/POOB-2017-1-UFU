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
public class PauloPOO_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Resistores R1 = new Resistores (10,10);
        Resistores R2 = new Resistores (10,5);
        
        Resistores Req = R1.Paralelo(R2);
        Req.Imprime();
        Req = R1.Serie(R2);
        Req.Imprime();
    }
    
}
