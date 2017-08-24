/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalaboratorio;

/**
 *
 * @author paulo
 */
public class Vetor3D extends Vetor2D {
    
    private double z;
    
    public Vetor3D(){
        super(0,0);
        this.z = 0;
    }
    
    public Vetor3D(double _x, double _y, double _z){
        super(_x,_y);
        this.z = _z;
    }
    
    public void setZ(double _z){
        this.z = _z;
    }
    
    public double getZ(){
        return this.z;
    }
    
    @Override
    public double moduloVetor()
    {
        modulo = Math.sqrt(this.x*this.x + this.y*this.y + this.z*this.z);
        return modulo;
    } 
    
    public Vetor3D produtoVetorial(Vetor3D vetor){
        //Retorna o produto vetorial de this x vetor
        Vetor3D PV = new Vetor3D();               
        PV.x = (vetor.y*this.z - vetor.z*this.y);
        PV.y = (vetor.z*this.x - vetor.x*this.z);
        PV.z = (vetor.x*this.y - vetor.y*this.x);
        PV.x *= -1;
        PV.y *= -1;
        PV.z *= -1;
        
        return PV;
    }   //a × b = [a2b3 − a3b2, a3b1 − a1b3, a1b2 − a2b1].

}
