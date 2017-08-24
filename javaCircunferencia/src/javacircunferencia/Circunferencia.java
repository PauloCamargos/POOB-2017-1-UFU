/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacircunferencia;
/**
 *
 * @author paulo
 */
public class Circunferencia {
    
    private double raio;
    private double pi = 3.1415;
    
    public Circunferencia()
    {
        raio = 10;
    } //Fim do construtor c/ aridade 0
    
    public Circunferencia(double r)
    {
        raio = r;
    } // Fim do construtor c/ aridade 1 
    
    public void setRaio(double r)
    {
        raio = r;
    } // Fim do metodo setter setRaio()
    
    public double getRaio()
    {
        return raio;
    } // Fim do método getter getRaio()
    
    public double calculaArea()
    {
        return Math.pow(raio, 2)*Math.PI;
    } // Fim do método calculaArea()
    
    public double calculaComprimento()
    {
        return 2*Math.PI*raio;
    } // Fim do meétodo calculaComprimento()
    
}
