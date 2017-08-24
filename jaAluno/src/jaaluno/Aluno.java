/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaaluno;

/**
 *
 * @author paulo
 */
public class Aluno {
    
    public String nome;
    private String matricula;
    private String telefone;
    
    public Aluno() {
        this.nome = " ";
        this.matricula = " ";
        this.telefone = " ";
    }
    
    public Aluno(String nome, String matricula, String telefone) {
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public void retornaDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Telefone: " + getTelefone());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
