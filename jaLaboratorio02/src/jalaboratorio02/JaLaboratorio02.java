/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalaboratorio02;

/**
 *
 * @author paulo
 */
public class JaLaboratorio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* === CÓDIGOS DE TESTE PARA TEMPO: ======
        Tempo time_1 = new Tempo();
        Tempo time_2 = new Tempo();
        
        time_1.solicitaTempo();
        time_2.solicitaTempo();

        time_1.imprimeTempo();
        time_2.imprimeTempo();
        
        Tempo time_3 = new Tempo();
        time_3 = time_1.subtrai_tempo(time_2);
        time_3.imprimeTempo();
        
        time_3 = time_1.adicionaTempo(time_2);
        time_3.imprimeTempo();
        
        === FIM CÓDIGOS DE TESTE PARA TEMPO: ======*/
        
        // CÓDIGOS PARA ESTACIONAMENTO
        /*
        Estacionamento carro_1 = new Estacionamento();
        carro_1.solicitaDados();
        carro_1.imprimeDados();
        //carro_1.valorEstacionamento();
        */
        
        Estacionamento matriz[] = new Estacionamento[2];
        for(int i =0; i<2; i++){
            int j = i+1;
            System.out.println("* * * Entre com os dados do veículo " + 
                    j + " * * *");
            matriz[i] = new Estacionamento();
            matriz[i].solicitaDados();
        }
        
        System.out.println("-------------------------------------------");
        System.out.println("---------------- RELATÓRIO ----------------");
        System.out.println("-------------------------------------------");
        
        for(int i = 0; i<2; i++){
            int j = i+1;
            System.out.println("VEÍCULO " + j);
            
            matriz[i].imprimeDados();
        }
        
        
        
    }
    
}
