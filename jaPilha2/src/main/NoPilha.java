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
public class NoPilha {
    
    public int data;
    public NoPilha next;

    public NoPilha(int data, NoPilha next) {
        this.data = data;
        this.next = next;
    }
    
    public NoPilha(int data) {
        this.data = data;
        this.next = null;
    }
    
    public int getData(){
        return this.data;
    }
    
    public NoPilha getNext(){
        return this.next;
    }
    
    public void setData(int _data){
        this.data = _data;
    }
    
    public void setNext(NoPilha _next){
        this.next = _next;
    }
    
    
    
    
    
}
