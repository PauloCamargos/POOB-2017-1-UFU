/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaaluno;

import jalivrodenotas.LivroDeNotas;
import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class HistoricoEscolar {
    
    private String nome_curso;
    private Aluno a1 = new Aluno();
    private LivroDeNotas livro_de_notas = new LivroDeNotas();
    
    public HistoricoEscolar(String nome_curso) {
        this.nome_curso = nome_curso;
    }

    public String getNome_curso() {
        return nome_curso;
    }
    
    public void novoCadastro(){
        // Cadastro de aluno
        Scanner input =  new Scanner(System.in);
        System.out.println("Digite seu nome:");
        a1.setNome(input.next());
        System.out.println("Digite seu Matricula:");
        a1.setMatricula(input.next());
        System.out.println("Digite seu Telefone:");
        a1.setTelefone(input.next());
        
        // Cadastro das notas
        System.out.println("Digite nome da disciplina: ");
        livro_de_notas.setDisciplina(input.next());
        livro_de_notas.setNotas();
    }

    public LivroDeNotas getLivro_de_notas() {
        return livro_de_notas;
    }
    
    
    public void exibeDados(){
        Sytem.out.println("Nome do cruso")
    }
    
    
}
