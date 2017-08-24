/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalaboratorio2;

/**
 *
 * @author Windows 8
 */
public class JaLaboratorio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estacionamento domingo[] = new Estacionamento[5];
        
        System.out.println ("Olá digite os dados de 5 carros: ");
        
        
        for(int i = 0; i <5 ; i++){ //***************************
            
            //carro[i] = new Estacionamento(); //***************************
            domingo[i] = new Estacionamento();
            domingo[i].le_dados();
        }
        
        for(int i =0; i < 5 ; i++){
            
            domingo[i].imprime_dados();
          
        }
        
    }
    
    
}
