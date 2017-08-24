/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulo
 */
public class Pilha {
    public NohPilha topo;
    
    public Pilha(){
        topo = null; //não foi inserido elemento
    }
    
    public boolean isEmpty(){
        if (topo == null)
            return true;
        else
            return false;
    }
    
    public void push(int insertItem){
        if(this.isEmpty()){
            NohPilha novo = new NohPilha(insertItem);
            topo = novo;
        }
        else{
            NohPilha novo_no = new NohPilha(insertItem,topo);
            topo = novo_no;     
            
        }
    }
    
    public int pop(){
        if(this.isEmpty()){
            System.out.println("A pilha está vazia!");
            return 0;
        }else{
            int temp = topo.data;
            System.out.println("Desempilhado: " + temp);
            topo = topo.getNext();
            return temp;
        }   
    }
    
    public void printConsole(){
        if(isEmpty()){
            System.out.println("Pilha vazia!");
        }else{
            System.out.println("Status da Pilha: ");
            NohPilha temp = topo;
            
            while(temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
            }    
        }
    }
    
    public String printSwing(){
        String itens = "Vazia"  ;
        NohPilha temp = topo;
        if(temp != null){
            itens = "";
            while(temp != null){
                itens += temp.getData();
                itens += "\n";
                temp = temp.getNext();
            }
        }
        System.out.println("Status da Pilha: ");
        System.out.println(itens);
        return itens;
    }
    
}
