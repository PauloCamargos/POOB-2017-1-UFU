/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalaboratorio03;

/**
 *
 * @author paulo
 */
public class JaLaboratorio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int qnt = 10;
        Empresa ufu;
        Funcionario janeiro[] = new Funcionario[qnt];
        
        janeiro[0] = new FunSemEstudo("Jon Snow", "001");
        janeiro[1] = new FunEnsinoBasico("Igrit", "002","Caic Laranjeiras");
        janeiro[2] = new FunEnsinoMedio("Sersei Lanister", "003", "Caic","Frei Egidio");
        janeiro[3] = new FunEnsinoSuperior("James Lanister","004", "Caic","Frei Egidio", "UFU");
        janeiro[4] = new FunSemEstudo("Ned Stark", "005");
        janeiro[5] = new FunSemEstudo("Lady Stark", "006");
        janeiro[6] = new FunEnsinoSuperior("HODOR", "002","Grifrinoria","Corleone","Jynx");
        janeiro[7] = new FunEnsinoBasico("Tyrion Lanister", "002","Sitio do Pica Pau Amarelo");
        janeiro[8] = new FunEnsinoMedio("Daenerys Targherian", "002","Namekusenn", "Columbia High School");
        janeiro[9] = new FunEnsinoBasico("Bran Stark", "002","Escola de Rock");

        for(int i = 0; i<qnt; i++){
            janeiro[i].imprimeDados();
            System.out.println("--------\n");
        }
        System.out.println(" ================================================ \n");
        
        ufu = new Empresa(janeiro);
        ufu.classificaGastos();
    }
    
}
