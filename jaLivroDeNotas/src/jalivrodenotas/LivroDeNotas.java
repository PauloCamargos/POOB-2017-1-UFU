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
public class LivroDeNotas {
    
    private String disciplina;
    private int[] notas = new int[8];
    
    public String getNome_curso() {
        return disciplina;
    }
        
    public LivroDeNotas()
    {
        this.disciplina = " ";
        //notas = new int[8];
        for(int i = 0;i < notas.length;i++)           
            notas[i] = 0;
    }
    
    public LivroDeNotas(String disciplina, int[] notas) {
        this.disciplina = disciplina;
        this.notas = notas;
    }
    
    public int getNotaMinima() {
        int n_min = notas[0];
        for (int i = 1; i < 8; i++) {
            if (notas[i] < n_min) {
                n_min = notas[i];
            }
        }
        return n_min;
    }
    
    public int getNotaMaxima(){
        int n_max = notas[0];
        for (int i = 1; i < 8; i++) {
            if (notas[i] > n_max) {
                n_max = notas[i];
            }
        }
        return n_max;
    }
    
    public int getMediaNotas(){
        int soma = 0;
        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        int media = soma / notas.length;
        return media;
    }    

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setNotas() {
        int[] copiaArray = new int[8];
        Scanner input = new Scanner(System.in);
       
        for(int i=0; i<8; i++)
        {
            int j = i+1;
            System.out.println("Entre a " + j + "ª nota.");
            copiaArray[i] = input.nextInt();
        }
        notas = copiaArray;
    }
    
}
