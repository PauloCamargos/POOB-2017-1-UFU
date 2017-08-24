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
public class Vetor2D {
    
    protected double x;
    protected double y;
    double PE; // Produto escalar
    double modulo;
    
    public Vetor2D()
    {
        x = 0;
        y = 0;
    } // Fim do construtor Vetor2D com aridade 0
    
    public Vetor2D(double a, double b)
    {
        x = a;
        y = b;
    } // Fim do construtor Vetor2D com aridade 1
    
    public void setX(double a)
    {
        x = a;
    } // Fim do mundo setter setX
    
    public void setY(double b)
    {
        y = b;
    } // Fim do metodo setter setY
    
    public double getX()
    {
        return x;
    } // Fim do metodo getter getX
    
    public double getY()
    {
        return y;
    } // Fim do metodo getter getY
    
    public double produtoEscalar(Vetor2D vetor)
    {
        
        PE = (this.x*vetor.getX() + this.y*vetor.getY());
        return PE;
    } // Fim do método produtoEscalar
     
    public double moduloVetor()
    {
        modulo = Math.sqrt(this.x*this.x + this.y*this.y);
        return modulo;
    } // FIM DO METODO moduloVetor()
    
    public double angulo(Vetor2D vetor)
    {
        double angulo;
        angulo = Math.toDegrees(Math.acos(PE/(this.moduloVetor()*vetor.moduloVetor())));
        return angulo;
    } // FIM DO METODO angulo()
    
    public Vetor2D projecao(Vetor2D vetor)
    {
        //retorna a projecao de um vetor 'this' sobre 'vetor'
        Vetor2D v_projecao = new Vetor2D(); // Cria um novo objeto Vetor2D
        double proj_x, proj_y;    // Armazena valores de coordenadas x e y
        // http://www.tutorbrasil.com.br/forum/viewtopic.php?t=22066
        proj_x = (this.produtoEscalar(vetor)/Math.pow(vetor.modulo, 2))*vetor.x;
        proj_y = (this.produtoEscalar(vetor)/Math.pow(vetor.modulo, 2))*vetor.y;
        v_projecao.x = proj_x;
        v_projecao.y = proj_y;
        return v_projecao;
    }  // FIM DO MÉTODO PROJECAO
     
}
