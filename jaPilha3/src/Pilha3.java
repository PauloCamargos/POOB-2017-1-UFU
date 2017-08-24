/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulo
 */
public class Pilha3 {
    public NoPilha3 topo;
    
    public Pilha3(){
        topo = null;
    }
    
    public Pilha3(NoPilha3 _topo){
        topo = _topo;
    }
        
    //isEmpty
    public boolean isEmpty(){
        if(topo == null){
            return true;
        }else{
            return false;
        }
    }
    
    // Push
    
    public void Push(int data){
        if(isEmpty()){
            NoPilha3 novo = new NoPilha3(data);
            topo = novo;
        }else{
            NoPilha3 novo = new NoPilha3(data, topo);
            topo = novo;
        }        
    }
    
    //Pop
    public void Pop(){
        if(isEmpty()){
            System.out.println("Pilha vazia");
        }else{
            int data;
            data = topo.getData();
            System.out.println(data);
            topo = topo.getNext();
        } 
    }
    
    //Print
    
    public String Print(){
        NoPilha3 temp = topo;
        String dados = "";
        if(temp == null){
            dados = "Lista Vazia";
        }else{
            while(temp != null){
                dados += temp.getData() + "\n";
                temp = temp.getNext();
            }
        }
        System.out.println(dados);
        return dados;
    }   
    
    //Max
    public String Max(){
        NoPilha3 temp = topo;
        String max;
        if(temp == null){
            max = "Lista Vazia";
        }else{
            max = Integer.toString(temp.getData());
            while(temp != null){
                if(temp.getData() > Integer.parseInt(max)){
                    max = Integer.toString(temp.getData()) ;
                }
                temp = temp.getNext();
            }
        }
        System.out.println(max);
        return max;
    } 
    
    //Min
    
    public String Min(){
        NoPilha3 temp = topo;
        String Min;
        if(temp == null){
            Min = "Lista Vazia";
        }else{
            Min = Integer.toString(temp.getData());
            while(temp != null){
                if(temp.getData() < Integer.parseInt(Min)){
                    Min = Integer.toString(temp.getData()) ;
                }
                temp = temp.getNext();
            }
        }
        System.out.println(Min);
        return Min;
    } 
    
}
