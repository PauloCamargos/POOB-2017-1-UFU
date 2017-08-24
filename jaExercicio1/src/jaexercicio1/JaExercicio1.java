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
public class JaExercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EmpregadoCLT clt = new EmpregadoCLT("Joao","Golpista","1210",5000);
        EmpregadoHORISTA horista = new EmpregadoHORISTA("Tulio","Revolucionista","0942",160,10);
        
        clt.imprimeDados();
        horista.imprimeDados();
    }
    
}
