/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalivrodenotas;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class JaLivroDeNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nota;
        int[] copiaArray = new int[8];
        Scanner input = new Scanner(System.in);
       
        for(int i=0; i<8; i++)
        {
            int j = i+1;
            System.out.println("Entre a " + j + "ª nota.");
            copiaArray[i] = input.nextInt();
        }
        
        LivroDeNotas livro_1 = new LivroDeNotas("POO", copiaArray);
        System.out.println("Curso: " + livro_1.getNome_curso());
        System.out.println("Nota máxima: " + livro_1.getNotaMaxima());
        System.out.println("Nota mínima: " + livro_1.getNotaMinima());
        System.out.println("Media: " + livro_1.getMediaNotas());
        
        
    }
    
}
