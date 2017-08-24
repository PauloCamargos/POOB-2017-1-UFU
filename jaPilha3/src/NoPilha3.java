/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulo
 */
public class NoPilha3 {
    
    public int data;
    public NoPilha3 next;
    
    public NoPilha3(int _data, NoPilha3 _next){
        data = _data;
        next = _next;
    }
    
    public NoPilha3(int _data){
        data = _data;
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NoPilha3 getNext() {
        return next;
    }

    public void setNext(NoPilha3 next) {
        this.next = next;
    }

    
}
