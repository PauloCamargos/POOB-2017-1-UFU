/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author paulo
 */
public class Pilha {
    public NoPilha topo;
    
    public Pilha(NoPilha _topo){
        topo = _topo;
    }
    
    public Pilha(){
        topo = null;
    }
    
    //IsEMpty
    public boolean isEmpty(){
        if(this.topo == null){
            return true;
        }else{
            return false;
        }      
    }    
    
    //PUSH
    public void Push(int data){
        if(this.isEmpty()){
            NoPilha novo = new NoPilha(data);
            this.topo = novo;
        }else{
            NoPilha novo = new NoPilha(data, topo);
            this.topo = novo;
        }
    }
    
    //POP
    public void Pop(){
        if(this.isEmpty()){
            System.out.println("Pilha Vazia!");
            printSwing();
        }else{
            int temp = topo.getData();
            System.out.println("Desempilhado: " + temp);
            topo = topo.getNext();
        }       
    }
    
    //PRINT CONSOLE
    public void printConsole(){
        if(this.isEmpty()){
            System.out.println("Pilha Vazia!");
        }else{
            NoPilha temp = this.topo;
            System.out.println("Elementos da Pilha: -----------------");
            while(temp != null){                
                int data = topo.getData();
                String itens = data + "\n";
                System.out.println(itens);
                temp = temp.getNext();
            }
        }
    }
    
   //PRINT SWING
    public String printSwing() {
        String itens = "Lista vazia";
            NoPilha temp = topo;
        if (temp != null) {
            itens = "";
            while (temp != null) {
                itens += temp.getData() + "\n";
                temp = temp.getNext();
            }
        }
        System.out.println(itens);
        return itens;
    }
    
    //MAX
    public int returnMax() {
        int max;
        if (isEmpty()) {
            return 0;
        } else {
            NoPilha temp = topo;
            max = temp.getData();
            while (temp != null) {
                if (temp.getData() > max) {
                    max = temp.getData();
                }
                temp = temp.getNext();
            }
        }
        return max;
    }
    
    //MIN
    public int returnMin() {
        int min;
        if (isEmpty()) {
            return 0;
        } else {
            NoPilha temp = topo;
            min = temp.getData();
            while (temp != null) {
                if (temp.getData() < min) {
                    min = temp.getData();
                }
                temp = temp.getNext();
            }
        }
        return min;
    }
}
