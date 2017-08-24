/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaretangulo;

/**
 *
 * @author paulo
 */
public class Retangulo {
    // Atributos: 
    private double base;
    private double altura;
    
    // Métodos:
    
    // Construtor - Cia objetos da classe. O nome do método tem que ser o mesmo 
        // da classe
    
    public Retangulo()   // Cria um construtor por default com aridade = 0
    {
        base = 10.0;
        altura = 10.0;
    } 
    
    public Retangulo(double b) // Cria um construtor com aridade = 1
    {
        base = b;
        altura = 8.0;        
    }
    public Retangulo(double b, double a) // Cria um construtor onde o usuario inicializa os valores (aridade = 2)
    {
        base = b;
        altura = a;
    } 
            
    public double areaRet()
    {
        return(base * altura);
    } // FIM do método areaRet()
    
    public void setBase(double b)
    {
        base = b;
    } // FIM do método setBase()
    
    public void setAltura(double a)
    {
        altura = a;
    } // FIM do método setAltura()
    
    public double getBase()
    {
        return base;
    } // FIM do método getBase()
    
    public double getAltura()
    {
        return altura;
    } // FIM do método getAltura()
    
    public double perimetro()
    {
        return(2 * altura + 2 * base);
    }
    
} // FIM da classe Retangulo
