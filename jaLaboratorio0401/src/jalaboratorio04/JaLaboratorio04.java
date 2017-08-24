/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalaboratorio04;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class JaLaboratorio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =  new Scanner(System.in);
        int tipo_ing;
        
        System.out.println("------------ INGRESSARIA ---------------");
        System.out.println("Digite (1) para ingresso normal e (2) para VIP.");
        
        tipo_ing = input.nextInt();
        if(tipo_ing == 1){
            Normal normal = new Normal();
            normal.imprimeNormal();
        }
        else if (tipo_ing == 2){
            System.out.println("Você escolheu ingresso VIP.");
            System.out.println("Digite (1) para Camarote Superior e (2) para "
                    + "Camarote Inferior.");
            tipo_ing = input.nextInt();
            if(tipo_ing == 1){
                CamaroteSuperior CS = new CamaroteSuperior();
                System.out.println("Você escolheu Camarote Superior.");
                CS.imprimeValor();
            }
            else if(tipo_ing == 2){
                CamaroteInferior CI = new CamaroteInferior();
                CI.imprimeLocalizacao();
                CI.imprimeValor();
            }
        }            
    }
    
}
