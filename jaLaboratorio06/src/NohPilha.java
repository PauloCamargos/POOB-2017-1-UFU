/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulo
 */
public class NohPilha {
    public int data;
    public NohPilha next;

    public NohPilha(int data, NohPilha next) {
        this.data = data;
        this.next = next;
    }
    
    public NohPilha(int data) {
        this.data = data;
        this.next = null;
    }
    public NohPilha() {
        this.data = 0;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NohPilha getNext() {
        return next;
    }

    public void setNext(NohPilha next) {
        this.next = next;
    }
    
    
}
